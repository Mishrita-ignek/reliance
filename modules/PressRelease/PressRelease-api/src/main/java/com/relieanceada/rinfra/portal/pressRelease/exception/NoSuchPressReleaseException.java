/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.relieanceada.rinfra.portal.pressRelease.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Vipin Singh
 */
@ProviderType
public class NoSuchPressReleaseException extends NoSuchModelException {

	public NoSuchPressReleaseException() {
	}

	public NoSuchPressReleaseException(String msg) {
		super(msg);
	}

	public NoSuchPressReleaseException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchPressReleaseException(Throwable cause) {
		super(cause);
	}

}