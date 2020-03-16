// Copyright (c) 2020 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
//
// WSO2 Inc. licenses this file to you under the Apache License,
// Version 2.0 (the "License"); you may not use this file except
// in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.wso2.mongo;

/**
 * Constants used in the module-mongodb.
 */
public class MongoDBConstants {
    public static final String ORGANIZATION_NAME = "wso2";
    public static final String MODULE_NAME = "mongodb";
    public static final String MODULE_VERSION = "0.9.0";
    public static final String ERROR_DETAIL_RECORD_TYPE_NAME = "ErrorDetail";

    //Error reasons
    public static final String DATABASE_ERROR_REASON = "{wso2/mongodb}DatabaseError";
    public static final String APPLICATION_ERROR_REASON = "{wso2/mongodb}ApplicationError";
}
