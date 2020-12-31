select * from player p;
select * from team;
select * from weapon;

ALTER TABLE test1222.player RENAME COLUMN "name" TO player_name;

select p.player_id, p.player_name, t.team_id, t.team_name from player p
join team t 
on p.team_id = t.team_id;

select p.player_id, p.player_name, t.team_id, t.team_name from player p
left join team t 
on p.team_id = t.team_id;

select p.player_id, p.player_name, t.team_id, t.team_name from player p
right join team t 
on p.team_id = t.team_id;

select p.player_id, p.player_name, t.team_id, t.team_name from player p
full join team t 
on p.team_id = t.team_id;

select p.player_id, p.player_name, t.team_id, t.team_name from player p
full outer join team t 
on p.team_id = t.team_id;

select p.player_id, p.player_name, w.weapon_id , w.weapon_name from player p
join weapon w
on main_weapon = weapon_id;

select p.player_id, p.player_name, p.team_id, p.second_weapon, p.age, p.contact, w.weapon_name from player p 
join weapon w 
on p.main_weapon = w.weapon_id 
where p.main_weapon = 5003;

select p.player_id, p.player_name, p.team_id, p.main_weapon, p.age, p.contact, w.weapon_name from test1222.player p join test1222.weapon w on p.second_weapon = w.weapon_id where p.second_weapon = 5002;

insert into player(player_id, "player_name", team_id, main_weapon) values(1005,'Peter',9002,5002);
insert into player(player_id, "player_name", team_id, second_weapon) values(1007,'Peter',9001,5004);
insert into player(player_id, "player_name", team_id, second_weapon) values(1001,'Matt',9003,5005);

update player
set player_name = 'May'
where player_id = 1007;

delete from player 
where player_id = 1001;


select * from player
where player_id = 1001;

insert into weapon values('keyboard',1,5005);
insert into weapon(weapon_id, weapon_name, strength) values(5006,'bare hand',3);

select * from weapon
where weapon_id = 5006;

--just for testing
select strength, weapon_name from weapon
where weapon_type = 'gun'
union 
select team_id, team_name from team;

select distinct weapon_type from weapon;

select * from weapon
where strength > 6
order by strength desc;

update weapon 
set weapon_id = 5050
where weapon_id = 5001;

select count(player_id) from player;

select player_name, team_id, main_weapon, second_weapon, age from test1222.player where contact = 3125556666;

select player_name, team_id, main_weapon, second_weapon, age, contact from test1222.player where player_id = 1001;

select p.player_id, p.player_name, p.team_id, p.second_weapon, p.age, p.contact, w.weapon_name from test1222.player p where main_weapon = 5003 left join test1222.weapon w on p.main_weapon = w.peapon_id;

select player_id, player_name, second_weapon, age, contact from test1222.player where team_id = 9001;

select player_id, team_id, main_weapon, second_weapon, age, contact from test1222.player where player_name = 'Bob';