-- Select codes for the following questions and save them in a file named hw1Query.sql
Select
select * from customers
select * from products

-- Where
select * from products where category_id=1
select * from products where category_id=1 and unit_price<>10

--Order By
select * from products order by product_name
select * from products order by category_id, product_name
select * from products order by unit_price
select * from products order by unit_price asc
select * from products where category_id=1 order by unit_price desc

-- Group By
select count(*) from products
select count(*) from products where category_id=2
select count(*) Adet from products where category_id=2
select category_id from products group by category_id
select category_id, count(*) from products group by category_id

-- Having
select category_id, count(*) from products where unit_price>20 group by category_id having count(*)<10

-- Join
select * from products inner join categories on products.category_id = categories.category_id