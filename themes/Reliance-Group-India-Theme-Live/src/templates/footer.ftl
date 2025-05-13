<#assign preferences = freeMarkerPortletPreferences.getPreferences({
"portletSetupPortletDecoratorId": "barebone",
"articleId":footer_article_id,
"groupId":"8354046"
}) />

<@liferay_portlet["runtime"]
defaultPreferences="${preferences}"
portletName="com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_${footer_article_id}"
/>


