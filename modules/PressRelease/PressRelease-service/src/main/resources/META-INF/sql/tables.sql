create table PRESS_RELEASE_PressRelease (
	pressId LONG not null primary key,
	newsYear VARCHAR(75) null,
	newsDate DATE null,
	heading VARCHAR(75) null,
	data_ VARCHAR(75) null,
	description VARCHAR(75) null,
	show_ VARCHAR(75) null,
	createdDate DATE null,
	fileName VARCHAR(75) null,
	fileURL VARCHAR(75) null
);