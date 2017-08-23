/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ranger.authorization.hbase;

import org.apache.hadoop.hbase.security.User;
import java.util.Map;
import java.util.Set;

/**
 * Created by 10069681 on 2017/8/14.
 */
public class HbaseAccessCache {
    private String access;
    private String userName;
    private String table;
    private String clusterName;
    private String operation;
    private String remoteAddr;
    private String ColumnFamilyAndColumn;
    private Map<String, Set<String>> families;
    private User user;
    private String updateTime;

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getColumnFamilyAndColumn() {
        return ColumnFamilyAndColumn;
    }

    public void setColumnFamilyAndColumn(String columnFamilyAndColumn) {
        ColumnFamilyAndColumn = columnFamilyAndColumn;
    }

    public Map<String, Set<String>> getFamilies() {
        return families;
    }

    public void setFamilies(Map<String, Set<String>> families) {
        for (Map.Entry<String, Set<String>> columnFamily : families.entrySet()) {
            String ColumnFalimy = columnFamily.getKey();
            Set<String> columns = columnFamily.getValue();
            ColumnFamilyAndColumn = ColumnFalimy;
            for (String column : columns) {
                ColumnFamilyAndColumn += column;
            }
        }
        this.families = families;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
