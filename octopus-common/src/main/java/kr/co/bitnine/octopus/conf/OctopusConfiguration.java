/*
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

package kr.co.bitnine.octopus.conf;

import org.apache.hadoop.conf.Configuration;

public class OctopusConfiguration extends Configuration {
    public static final String MASTER_SERVER_ADDRESS = "master.server.address";
    public static final String MASTER_SESSION_MAX = "master.session.max";
    public static final String MASTER_CONNECTION_POOL_MAX = "master.connection.pool.max";
    public static final String METASTORE_CLASS = "metastore.class";

    static {
        Configuration.addDefaultResource("octopus-default.xml");
        Configuration.addDefaultResource("octopus-site.xml");
    }

    public OctopusConfiguration() {
        super();
    }
}
