/*
* Copyright 2015 herd contributors
*
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
package org.finra.herd.model.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A storage policy transition type.
 */
@Table(name = "strge_plcy_trnsn_type_cd_lk")
@Entity
public class StoragePolicyTransitionTypeEntity extends AuditableEntity
{
    /**
     * Storage policy transition type to archive business object data.
     */
    public static final String GLACIER = "GLACIER";

    /**
     * The code column.
     */
    @Id
    @Column(name = "strge_plcy_trnsn_type_cd")
    private String code;

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }
}
