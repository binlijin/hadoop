/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hdfs.server.federation.store.protocol.impl.pb;

import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.OverrideNamenodeRegistrationResponseProto;
import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.OverrideNamenodeRegistrationResponseProtoOrBuilder;
import org.apache.hadoop.hdfs.server.federation.store.protocol.OverrideNamenodeRegistrationResponse;

/**
 * Protobuf implementation of the state store API object
 * OverrideNamenodeRegistrationResponse.
 */
public class OverrideNamenodeRegistrationResponsePBImpl extends
    OverrideNamenodeRegistrationResponse {

  private FederationProtocolPBTranslator<
  OverrideNamenodeRegistrationResponseProto,
  OverrideNamenodeRegistrationResponseProto.Builder,
  OverrideNamenodeRegistrationResponseProtoOrBuilder> translator =
      new FederationProtocolPBTranslator<
      OverrideNamenodeRegistrationResponseProto,
      OverrideNamenodeRegistrationResponseProto.Builder,
      OverrideNamenodeRegistrationResponseProtoOrBuilder>(
          OverrideNamenodeRegistrationResponseProto.class);

  public OverrideNamenodeRegistrationResponsePBImpl() {
  }

  @Override
  public OverrideNamenodeRegistrationResponseProto getProto() {
    return this.translator.build();
  }

  @Override
  public void setProto(Object protocol) {
    this.translator.setProto(protocol);
  }

  @Override
  public boolean getResult() {
    return this.translator.getProtoOrBuilder().getStatus();
  }

  @Override
  public void setResult(boolean result) {
    this.translator.getBuilder().setStatus(result);
  }
}