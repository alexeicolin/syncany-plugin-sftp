/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2014 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany.plugins.sftp;

import org.syncany.plugins.transfer.TransferPlugin;

/**
 * Identifies the SFTP-based storage {@link TransferPlugin} for Syncany. 
 * 
 * <p>This class defines the identifier, name and 
 * version of the plugin. It furthermore allows the instantiation 
 * of a plugin-specific {@link SftpTransferSettings}. 
 * 
 * @author Vincent Wiencek <vwiencek@gmail.com>
 */
public class SftpTransferPlugin extends TransferPlugin {
	public SftpTransferPlugin() {
		super("sftp");
	}
}
