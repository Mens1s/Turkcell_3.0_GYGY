-- SQL - Structured Query Language

-- DDL - DML
-- Data Definition Language -> Verinin tanımını işleyen sql queryleri.
-- Data Manipulation Language -> Verinini kendisini işleyen sql queryleri.

-- SELECT [kolonlar] from {tablo}
SELECT * FROM products;

SELECT id,name from products;

Select * from products WHERE unitprice > 200 or stock > 5

Select * from products WHERE name='Laptop'

Select * from products ORDER BY stock ASC -- default ASC yazma gereği yok.
-- Ascending, Descending
Select * from products ORDER BY stock DESC

Select * from products 
Where stock > 0 
ORDER BY stock DESC
-- la
Select * from products WHERE name='Laptop'
-- LIKE
-- % -> Sağ ve sol tarafa eklendiğinde o kısımda kaç adet ve hangi karakter olduğunu umursamaz.

-- L Harfi ile başlayan ürünler
Select * from products WHERE name LIKE 'L%'

-- p harfi ile biten ürünler
Select * from products WHERE name LIKE '%p'

-- Mo ile başlayan e ile biten ürünler
Select * from products WHERE name LIKE 'Mo%e'

-- _
-- _ -> Sağ ve sol tarafa eklendiğinde o kısımda hangi karakter olduğunu umursamaz.
Select * from products WHERE name LIKE 'Mo__e'

Select * from products WHERE name LIKE '_____'
-- Advanced Search ElasticSearch

-- ESCAPE CHARACTER
Select * from products WHERE name LIKE '%\%%' ESCAPE '\';

Select * from products WHERE unitprice > 50 and unitprice < 500

Select * from products WHERE unitprice BETWEEN 51 AND 499

Select * from products WHERE LOWER(name) BETWEEN 'a' AND 'f%'

-- Aggregate Function
-- En düşük fiyat nedir?
Select min(unitprice) from products
-- En yüksek fiyat nedir?
Select max(unitprice) from products
-- Ortalama fiyat nedir?
SELECT avg(unitprice) as "Ortalama Ürün Fiyatı" from products
-- Kaç adet ürünüm var?
Select COUNT(*) as "Ürün Sayısı" from products

SELECT COUNT(*) as "Ürün Sayısı", 
avg(unitprice) as "Ortalama Ürün Fiyatı", 
max(unitprice) as "En Pahalı Fiyat",
min(unitprice) as "En Ucuz Fiyat"
from products

Select * from products WHERE CHAR_LENGTH(name) > 10


-- İç içe sorgular
-- Inner Queries
Select * from products where unitprice = (  Select min(unitprice) from products  )

Select * from products where unitprice = (  Select max(unitprice) from products  )

Select * from products where unitprice > (  Select avg(unitprice) from products  )

Select * from products where unitprice < (  Select avg(unitprice) from products  )

-- DML

-- Insert


INSERT INTO products(name, unitprice, stock, category_id) VALUES('Insert Deneme', 500, 50, 2)

INSERT INTO products(name, unitprice, stock) VALUES('Insert Deneme 2', 300, 1)

-- Update
-- Koşulu unutursak tüm tablo etkilenir!!
Update products
SET category_id=4, stock=70
WHERE id=18

-- Delete
Delete from products where id=19

----

-- JOIN
Select * from products 
INNER JOIN categories ON products.category_id=categories.id --fk pk birleşimini konfigüre
-- 
Select products.name,categories.name from products 
INNER JOIN categories ON products.category_id=categories.id
--
Select p.name, c.name, p.unitprice, c.id from products p
INNER JOIN categories c ON p.category_id=c.id
--
Select * from users u
JOIN carts c ON u.id=c.user_id
JOIN products_carts pc ON c.id=pc.cart_id
--
Select * from carts c
JOIN products_carts pc on c.id=pc.cart_id
--
Select * from carts c
LEFT JOIN products_carts pc on c.id=pc.cart_id
WHERE pc.id IS NULL
--
Select * from carts c
RIGHT JOIN products_carts pc on c.id=pc.cart_id
--
Select * from carts c
FULL OUTER JOIN products_carts pc on c.id=pc.cart_id
--
-- Group By -> 
-- 15 adet soru-cevap querysi.
-- Hangi ürün kaç adet sattı?
-- Cevap
Select * from users

Select unitprice, COUNT(*) from products
group by unitprice

Select country,city, COUNT(*) from users
group by country,city
order by count(*) desc

