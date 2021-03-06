/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package org.apache.http.impl.nio.pool;

class LeaseRequest<T, E extends PoolEntry<T>> {

    private final T route;
    private final Object state;
    private final int connectTimeout;
    private final PoolEntryCallback<T, E> callback;

    public LeaseRequest(
            final T route,
            final Object state,
            final int connectTimeout,
            final PoolEntryCallback<T, E> callback) {
        super();
        this.route = route;
        this.state = state;
        this.connectTimeout = connectTimeout;
        this.callback = callback;
    }

    public T getRoute() {
        return this.route;
    }

    public Object getState() {
        return this.state;
    }

    public PoolEntryCallback<T, E> getCallback() {
        return this.callback;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        buffer.append(this.route);
        buffer.append("][");
        buffer.append(this.state);
        buffer.append("]");
        return super.toString();
    }

}
