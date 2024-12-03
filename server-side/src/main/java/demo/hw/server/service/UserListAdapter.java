/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package demo.hw.server.service;


import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class UserListAdapter extends XmlAdapter<UserList, List<User>> {


    @Override
    public List<User> unmarshal(UserList userList) throws Exception {
        return userList == null ? new ArrayList<User>(): userList.getUserList();
    }

    @Override
    public UserList marshal(List<User> users) throws Exception {
        UserList userList = new UserList();
        userList.setUserList(users);
        return userList;
    }
}

