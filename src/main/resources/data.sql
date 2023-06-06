-- サンプルデータ登録スクリプト

-- /* マスタレコード登録スクリプト群 */

-- 分類テーブル
INSERT INTO categories (name) VALUES ('シティホテル');
INSERT INTO categories (name) VALUES ('リゾートホテル');
INSERT INTO categories (name) VALUES ('ビジネスホテル');
INSERT INTO categories (name) VALUES ('旅館');
INSERT INTO categories (name) VALUES ('民宿');
INSERT INTO categories (name) VALUES ('ペンション');

-- 宿泊客テーブル
INSERT INTO guests (name, address, email, phone, birthday, password) VALUES ('芹沢鴨', '北茨城市', 's-kamo@mito.rosi-gumi.org', '090-9999-9999', '1863-10-28', 'serizawa');
INSERT INTO guests (name, address, email, phone, birthday, password) VALUES ('本郷猛', '東京都豊島区', 't-hongo@isinomori.or.jp', '080-0000-0001', '1971-04-03', 'takesi');
