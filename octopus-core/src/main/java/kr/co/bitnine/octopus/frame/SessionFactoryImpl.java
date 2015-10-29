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

package kr.co.bitnine.octopus.frame;

import kr.co.bitnine.octopus.meta.MetaStore;
import kr.co.bitnine.octopus.schema.SchemaManager;

import java.nio.channels.SocketChannel;

public final class SessionFactoryImpl implements SessionFactory {
    private final MetaStore metaStore;
    private final SchemaManager schemaManager;

    public SessionFactoryImpl(MetaStore metaStore,
                              SchemaManager schemaManager) {
        this.metaStore = metaStore;
        this.schemaManager = schemaManager;
    }

    @Override
    public Session createSession(SocketChannel clientChannel,
                                 Session.EventHandler sessEvtHandler) {
        return new Session(clientChannel, sessEvtHandler,
                metaStore.getMetaContext(), schemaManager);
    }
}