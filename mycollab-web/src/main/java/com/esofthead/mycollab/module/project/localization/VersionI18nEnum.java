package com.esofthead.mycollab.module.project.localization;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

@BaseName("localization/project/version")
@LocaleData({ @Locale("en_US"), @Locale("ja_JP") })
public enum VersionI18nEnum {
	LIST_VIEW_TITLE,

	FORM_NEW_TITLE,
	FORM_EDIT_TITLE,
	FORM_NAME,
	FORM_DESCRIPTION,
	FORM_STATUS,
	FORM_DUE_DATE,
	FORM_VERSION_ERROR_MSG,

	RELATED_BUGS_TAB,
	
	NO_ITEM_VIEW_TITLE,
	NO_ITEM_VIEW_HINT
}
