/*-
 * #%L
 * This file is part of "Apromore Enterprise Edition".
 * %%
 * Copyright (C) 2019 - 2022 Apromore Pty Ltd. All Rights Reserved.
 * %%
 * NOTICE:  All information contained herein is, and remains the
 * property of Apromore Pty Ltd and its suppliers, if any.
 * The intellectual and technical concepts contained herein are
 * proprietary to Apromore Pty Ltd and its suppliers and may
 * be covered by U.S. and Foreign Patents, patents in process,
 * and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this
 * material is strictly forbidden unless prior written permission
 * is obtained from Apromore Pty Ltd.
 * #L%
 */

package org.apromore.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Configurable;



@Entity
@Table(name = "physical_log",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"})
    }
)
@Configurable("physical_log")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalLog extends BaseEntity {

    @OneToOne(mappedBy = "physicalLog")
    Log log;

    @Column(name = "catalogue_table_name", nullable = false)
    private String catalogueTableName;

    @Column(name = "file_location", nullable = false)
    private String fileLocation;
}
