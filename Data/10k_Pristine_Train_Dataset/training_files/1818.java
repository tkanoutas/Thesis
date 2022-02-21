/*
 * Copyright 2010 Proofpoint, Inc.
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
package io.airlift.event.client;

@EventType("Dummy")
public class DummyEventClass
{
    private final double doubleValue;
    private final int intValue;
    private final String stringValue;
    private final boolean boolValue;

    public DummyEventClass(double doubleValue, int intValue, String stringValue, boolean boolValue)
    {
        this.doubleValue = doubleValue;
        this.intValue = intValue;
        this.stringValue = stringValue;
        this.boolValue = boolValue;
    }

    @EventField
    public double getDoubleValue()
    {
        return doubleValue;
    }

    @EventField
    public int getIntValue()
    {
        return intValue;
    }

    @EventField
    public String getStringValue()
    {
        return stringValue;
    }

    @EventField
    public boolean isBoolValue()
    {
        return boolValue;
    }
}
