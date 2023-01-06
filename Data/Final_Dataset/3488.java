/*
   Copyright (c) 2014 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.linkedin.restli.client.uribuilders;


import com.linkedin.jersey.api.uri.UriBuilder;
import com.linkedin.restli.client.CreateIdRequest;
import com.linkedin.restli.common.ProtocolVersion;

import java.net.URI;


/**
 * @author Moira Tagle
 */
public class CreateIdRequestUriBuilder extends AbstractRestliRequestUriBuilder<CreateIdRequest<?, ?>>
{
  CreateIdRequestUriBuilder(CreateIdRequest<?, ?> request, String uriPrefix, ProtocolVersion version)
  {
    super(request, uriPrefix, version);
  }

  @Override
  public URI build()
  {
    UriBuilder b = UriBuilder.fromUri(buildBaseUriWithPrefix());
    appendQueryParams(b);
    return b.build();
  }
}
