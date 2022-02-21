/*
 * Copyright 2017 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.javascript.jscomp;

import static com.google.common.truth.Truth.assertThat;

import junit.framework.TestCase;

/** Tests {@link Timeline}. */
public class TimelineTest extends TestCase {

  private static class Event {
    final int hashcode;

    Event(int hashcode) {
      this.hashcode = hashcode;
    }

    @Override
    public int hashCode() {
      return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj instanceof Event) {
        return ((Event) obj).hashcode == hashcode;
      }
      return false;
    }
  }

  private static final Event ATE_GREEN_EGGS = new Event(1);
  private static final Event ATE_HAM = new Event(2);
  private static final Event ATE_HASHBROWNS = new Event(3);
  private Timeline<Event> timeline;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    timeline = new Timeline<>();
  }

  public void testRemove_simple() {
    timeline.mark("Monday");
    timeline.add(ATE_GREEN_EGGS);
    timeline.remove(ATE_GREEN_EGGS);

    assertThat(timeline.getSince("Monday")).isEmpty();
  }

  public void testRemove_maintainsOrder() {
    timeline.mark("Monday");
    timeline.add(ATE_GREEN_EGGS);
    timeline.add(ATE_HAM);
    timeline.add(ATE_HASHBROWNS);
    timeline.remove(ATE_HAM);

    assertThat(timeline.getSince("Monday")).containsExactly(ATE_GREEN_EGGS, ATE_HASHBROWNS);
  }

  public void testUnknownTimesReturnNull() {
    assertNull(timeline.getSince("Monday"));
  }

  public void testDoesntReturnValuesBeforeTime() {
    timeline.add(ATE_GREEN_EGGS);
    timeline.mark("Monday");

    assertThat(timeline.getSince("Monday")).isEmpty();
  }

  public void testReturnsValuesAfterTime() {
    timeline.mark("Monday");
    timeline.add(ATE_GREEN_EGGS);

    assertThat(timeline.getSince("Monday")).containsExactly(ATE_GREEN_EGGS);
  }

  public void testMaintainsOrder1() {
    timeline.mark("Monday");
    timeline.add(ATE_GREEN_EGGS);
    timeline.add(ATE_HAM);

    assertThat(timeline.getSince("Monday")).containsExactly(ATE_GREEN_EGGS, ATE_HAM).inOrder();
  }

  public void testMaintainsOrder2() {
    timeline.mark("Monday");
    timeline.add(ATE_GREEN_EGGS);
    timeline.add(ATE_GREEN_EGGS);
    timeline.add(ATE_HAM);

    assertThat(timeline.getSince("Monday")).containsExactly(ATE_GREEN_EGGS, ATE_HAM).inOrder();
  }

  public void testMaintainsOrder3() {
    timeline.mark("Monday");
    timeline.add(ATE_GREEN_EGGS);
    timeline.add(ATE_HAM);
    timeline.add(ATE_GREEN_EGGS);

    assertThat(timeline.getSince("Monday")).containsExactly(ATE_HAM, ATE_GREEN_EGGS).inOrder();
  }

  public void testMaintainsOrder4() {
    timeline.mark("Monday");
    timeline.add(ATE_GREEN_EGGS);
    timeline.add(ATE_HAM);
    timeline.add(ATE_GREEN_EGGS);
    timeline.add(ATE_HAM);

    assertThat(timeline.getSince("Monday")).containsExactly(ATE_GREEN_EGGS, ATE_HAM).inOrder();
  }

  public void testUsesEqualityAndHashcode() {
    // Are object and hashcode equal.
    Event ateBerries = new Event(10);
    Event ateGrapes = new Event(10);

    timeline.mark("Monday");
    timeline.add(ateBerries);
    timeline.add(ateGrapes);

    assertThat(timeline.getSince("Monday")).containsExactly(ateBerries).inOrder();
    assertThat(timeline.getSince("Monday")).containsExactly(ateGrapes).inOrder();
  }

  public void testUpdatesExistingTimes() {
    timeline.mark("Monday");
    timeline.add(ATE_GREEN_EGGS);
    timeline.mark("Monday");

    assertThat(timeline.getSince("Monday")).isEmpty();
  }

  public void testManagesDifferentTimes() {
    timeline.mark("Monday");
    timeline.add(ATE_GREEN_EGGS);
    timeline.mark("Thursday");
    timeline.add(ATE_HAM);

    assertThat(timeline.getSince("Monday")).containsExactly(ATE_GREEN_EGGS, ATE_HAM).inOrder();
    assertThat(timeline.getSince("Thursday")).containsExactly(ATE_HAM);
  }
}
