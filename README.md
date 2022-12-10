# java-sample-app

## カテゴリマスタ動作確認用SQL
```sql
create table main.category (
  category_id serial not null
  , name character varying(25) not null
  , last_update timestamp(6) without time zone default now() not null
  , primary key (category_id)
);
```

## TODOリスト動作確認用SQL

```sql
 DROP TABLE main.todo;   
 CREATE TABLE main.todo (
  todo_id integer not null
  , task text not null
  , check_flag boolean 
  , last_update timestamp(6) without time zone not null
  , primary key (todo_id)
 )
 ;

 CREATE SEQUENCE main.todo_seq
  INCREMENT BY 1 
  MAXVALUE 99999999
  START WITH 1
  ;
```