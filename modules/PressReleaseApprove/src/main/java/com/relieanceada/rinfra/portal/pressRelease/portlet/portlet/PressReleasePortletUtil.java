package com.relieanceada.rinfra.portal.pressRelease.portlet.portlet;

import java.util.List;

import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.kernel.util.DLUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;
import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;

public class PressReleasePortletUtil {
private static final Log _log = LogFactoryUtil.getLog(PressReleasePortletUtil.class);
	
	public static List<PressRelease> generateDownloadURL(List<PressRelease> pressReleaseDTOList, ThemeDisplay themeDisplay)
	  {
	    try
	    {
	      DLFolder dlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), 0L, "Whats New");
	      if (Validator.isNotNull(dlFolder))
	      {
	        DLFolder childFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), "PRESS RELEASES");
	        if (Validator.isNotNull(childFolder)) {
	          for (PressRelease pressReleaseDTO : pressReleaseDTOList) {
	            if (Validator.isNotNull(pressReleaseDTO.getFileName()))
	            {
	              FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), childFolder
	                .getFolderId(), pressReleaseDTO.getFileName().trim());
	              if (Validator.isNotNull(fileEntry)) {
	                pressReleaseDTO.setFileURL(DLUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, ""));
	              }
	            }
	          }
	        }
	      }
	    }
	    catch (NoSuchFileEntryException e)
	    {
	      DLFolder childFolder;
	      _log.info("No Such File found ....  " + e);
	    }
	    catch (PortalException e)
	    {
	      _log.error(e);
	    }
	    return pressReleaseDTOList;
	  }
}
