create table Rinfra_news (
	newsId LONG not null primary key,
	headLine VARCHAR(75) null,
	publication VARCHAR(75) null,
	downloadUrl VARCHAR(75) null,
	fileName VARCHAR(75) null,
	date_ DATE null,
	year INTEGER,
	month INTEGER,
	show_ VARCHAR(75) null
);