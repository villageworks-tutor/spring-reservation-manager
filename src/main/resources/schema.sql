-- データベースssm_dbに接続
\c ssm_db

-- テーブルの削除
DROP TABLE IF EXISTS categories CASCADE;
DROP TABLE IF EXISTS accommodations CASCADE;
DROP TABLE IF EXISTS plans CASCADE;
DROP TABLE IF EXISTS reservations CASCADE;
DROP TABLE IF EXISTS remains CASCADE;
DROP TABLE IF EXISTS guests CASCADE;

-- 分類テーブルの生成
CREATE TABLE categories (
	id SERIAL NOT NULL PRIMARY KEY,
	name VARCHAR(10)
);

-- 宿泊施設テーブルの生成
CREATE TABLE accommodations (
	id SERIAL NOT NULL PRIMARY KEY,
	name VARCHAR(10),
	category_id INTEGER NOT NULL,
	location VARCHAR(255) 
);

-- 宿泊プランテーブルの生成
CREATE  TABLE plans (
	id SERIAL NOT NULL PRIMARY KEY,
	accommodation_id INTEGER NOT NULL,
	content VARCHAR(255) NOT NULL,
	rooms INTEGER NOT NULL,
	stay_count INTEGER NOT NULL -- ユーザの要求仕様
);

-- 予約テーブルの生成
CREATE TABLE reservations (
	id SERIAL NOT NULL PRIMARY KEY,
	guest_id INTEGER NOT NULL,
	plan_id INTEGER NOT NULL,
	rooms INTEGER NOT NULL,
	checkin_on Date DEFAULT current_date
);

-- 残部屋数テーブルの生成
CREATE TABLE remains (
	plan_id INTEGER NOT NULL,
	room_count INTEGER NOT NULL
);

-- 宿泊者テーブルの生成
CREATE TABLE guests (
	id SERIAL NOT NULL PRIMARY KEY,
	name VARCHAR(255),
	address VARCHAR(255),
	email VARCHAR(255),
	phone CHAR(15),
	birthday Date,
	password VARCHAR(255)
);

-- 外部キー制約の設定群 
ALTER TABLE accommodations ADD FOREIGN KEY (category_id) REFERENCES categories(id);
ALTER TABLE plans ADD FOREIGN KEY (accommodation_id) REFERENCES accommodations(id);
ALTER TABLE reservations ADD FOREIGN KEY (guest_id) REFERENCES guests(id);
ALTER TABLE remains ADD FOREIGN KEY (plan_id) REFERENCES plans(id);
