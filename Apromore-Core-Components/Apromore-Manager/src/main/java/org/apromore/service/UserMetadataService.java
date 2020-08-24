/*-
 * #%L
 * This file is part of "Apromore Core".
 * %%
 * Copyright (C) 2018 - 2020 Apromore Pty Ltd.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
package org.apromore.service;

import org.apromore.dao.model.Usermetadata;
import org.apromore.exception.UserNotFoundException;
import org.apromore.util.UserMetadataTypeEnum;

import java.util.List;
import java.util.Set;

public interface UserMetadataService {

    /**
     * Save as a new User Metadata
     *
     * @param metadata             Content of user metadata
     * @param userMetadataTypeEnum Type of UserMetadata, get from UserMetadataTypeEnum
     * @param username             username
     * @param logIds               List of logId
     * @throws UserNotFoundException Can't find a user with specified username
     */
    void saveUserMetadata(String metadata, UserMetadataTypeEnum userMetadataTypeEnum, String username,
                          List<Integer> logIds) throws UserNotFoundException;


    /**
     * Save as a new User Metadata. Use this method when only one log is linked to this metadata.
     *
     * @param userMetadataContent  Content of user metadata
     * @param userMetadataTypeEnum Type of UserMetadata, get from UserMetadataTypeEnum
     * @param username             username
     * @param logId                logId
     * @throws UserNotFoundException Can't find a user with specified username
     */
    void saveUserMetadataLinkedToOneLog(String userMetadataContent, UserMetadataTypeEnum userMetadataTypeEnum,
                                        String username,
                                        Integer logId) throws UserNotFoundException;

    /**
     * Update a user metadata.
     *
     * @param userMetadataId Id of user metadata
     * @param username       username
     * @param content        Content of user metadata
     * @throws UserNotFoundException
     */
    void updateUserMetadata(Integer userMetadataId, String username, String content) throws UserNotFoundException;

    /**
     * Delete a user metadata logically.
     *
     * @param userMetadataId Id of user metadata
     * @param username       username
     * @throws UserNotFoundException Can't find a user with specified username
     */
    void deleteUserMetadata(Integer userMetadataId, String username) throws UserNotFoundException;

    /**
     * Find a set of user metadata
     *
     * @param username             username
     * @param logIds               List of logId
     * @param userMetadataTypeEnum Type of UserMetadata, get from UserMetadataTypeEnum
     * @return A set of user metadata
     * @throws UserNotFoundException Can't find a user with specified username
     */
    Set<Usermetadata> getUserMetadata(String username, List<Integer> logIds,
                                      UserMetadataTypeEnum userMetadataTypeEnum) throws UserNotFoundException;

    /**
     * Find whether is specified user can write to this user metadata
     *
     * @param username       username
     * @param UsermetadataId Id of user metadata
     * @return boolean
     * @throws UserNotFoundException Can't find a user with specified username
     */
    boolean canUserEditMetadata(String username, Integer UsermetadataId) throws UserNotFoundException;

    /**
     * Save a new dashboard template
     *
     * @param content Content of user metadata
     * @param username username
     * @throws UserNotFoundException Can't find a user with specified username
     */
    void saveDashTemplate(String content, String username) throws UserNotFoundException;

    /**
     * Find a set of dashboard template
     *
     * @param username username
     * @return A set of dashboard template
     * @throws UserNotFoundException Can't find a user with specified username
     */
    Set<Usermetadata> getDashTemplate(String username) throws UserNotFoundException;
}