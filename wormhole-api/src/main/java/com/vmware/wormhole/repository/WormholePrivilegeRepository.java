/**
 * Copyright 2019 VMware, Inc.
 * SPDX-License-Identifier: BSD-2-Clause
*/
package com.vmware.wormhole.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vmware.wormhole.common.model.WormholePrivilege;

public interface WormholePrivilegeRepository extends MongoRepository<WormholePrivilege,String>{

}