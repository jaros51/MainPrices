create or replace table webmaster.asset
(
    id         int auto_increment
        primary key,
    name       text not null,
    asset_type int  not null
)
charset = utf8mb3;

INSERT INTO asset VALUES (1,'BTCUSD',3);
INSERT INTO asset VALUES (2,'AAPL',2);
INSERT INTO asset VALUES (3,'EURUSD',1);

