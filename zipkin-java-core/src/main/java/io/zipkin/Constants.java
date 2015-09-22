/**
 * Copyright 2015 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.zipkin;

public final class Constants {
  /* Common annotation values */
  public static final String CLIENT_RECV = "cr";
  public static final String CLIENT_SEND = "cs";
  public static final String SERVER_RECV = "sr";
  public static final String SERVER_SEND = "ss";
  public static final String WIRE_SEND = "wr";
  public static final String WIRE_RECV = "ws";

  /**
   * The endpoint associated with "CLIENT_" annotations is not necessarily {@link
   * Annotation#host()}
   */
  public static final String CLIENT_ADDR = "ca";
  /**
   * The endpoint associated with "SERVER_" annotations is not necessarily {@link
   * Annotation#host()}
   */
  public static final String SERVER_ADDR = "sa";

  private Constants() {
  }
}
