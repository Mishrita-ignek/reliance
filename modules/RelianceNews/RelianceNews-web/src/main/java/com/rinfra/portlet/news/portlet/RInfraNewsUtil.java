package com.rinfra.portlet.news.portlet;
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
import com.rinfra.news.model.PressNews;

public class RInfraNewsUtil {
	private static final Log _log = LogFactoryUtil.getLog(RInfraNewsUtil.class);
	  private static final String RELIANCE_NEWS = "RELIANCE NEWS";
	  private static final String RINFRA_NEWS = "RINFRA NEWS";
	  
	  public static List<PressNews> generateDownloadURL(List<PressNews> newsRoomWrappers, ThemeDisplay themeDisplay)
	  {
	    try
	    {
	      DLFolder dlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), 0L, "RELIANCE NEWS");
	      if (Validator.isNotNull(dlFolder))
	      {
	    	  DLFolder childFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), "RINFRA NEWS");
	        if (Validator.isNotNull(childFolder)) {
	          for (PressNews newsRoomWrapper : newsRoomWrappers) {
	            if (Validator.isNotNull(newsRoomWrapper.getFileName())) {
	              try
	              {
	                FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), childFolder.getFolderId(), newsRoomWrapper.getFileName().trim());
	                if (Validator.isNotNull(fileEntry)) {
	                  newsRoomWrapper.setDownloadUrl(DLUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, ""));
	                  System.out.println("DownloadUrl"+newsRoomWrapper.getDownloadUrl());
	                }
	              }
	              catch (NoSuchFileEntryException localNoSuchFileEntryException) {}
	            }
	          }
	        }
	      }
	    }
	    catch (PortalException e)
	    {
	      DLFolder childFolder;
	      _log.error("Error while retriving document" + e);
	    }
	    System.out.println("RInfraNewsUtil.generateDownloadURL()::"+newsRoomWrappers);
	    return newsRoomWrappers;
	  }
}
