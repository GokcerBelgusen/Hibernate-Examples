/*
 *   Copyright 2012 Bahadır AKIN
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.bahadirakin.persistance.model;

import java.io.Serializable;

/**
 * All database entities must implements this interface, which represents the
 * minimum requirements to meet.
 * 
 * <p>
 * A database entity always has <code>Integer</code> surrogate key (system ID).
 * It must also be {@link Serializable}, {@link Cloneable} and
 * {@link Comparable}
 * </p>
 * 
 * @author Bahadır AKIN
 * 
 */
public interface IEntity extends Serializable, Cloneable, Comparable<IEntity> {

	public Integer getId();

	public void setId(Integer id);

	boolean isNew();
}
