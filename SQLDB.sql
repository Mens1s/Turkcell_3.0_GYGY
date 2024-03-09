--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

-- Started on 2024-03-09 17:01:51 +03

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3811 (class 1262 OID 16398)
-- Name: turkcelldb; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE turkcelldb WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'C';


ALTER DATABASE turkcelldb OWNER TO postgres;

\connect turkcelldb

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3775 (class 0 OID 16466)
-- Dependencies: 228
-- Data for Name: addreses; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.addreses (id, distinct_id, open_address, telephone_number, user_id) OVERRIDING SYSTEM VALUE VALUES (1, 1, 'açık adresim
', '545973', 1) ON CONFLICT DO NOTHING;


--
-- TOC entry 3799 (class 0 OID 16679)
-- Dependencies: 252
-- Data for Name: banks; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.banks (id, bank_name) OVERRIDING SYSTEM VALUE VALUES (1, 'akbank') ON CONFLICT DO NOTHING;


--
-- TOC entry 3803 (class 0 OID 16720)
-- Dependencies: 256
-- Data for Name: brands; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.brands (id, name) OVERRIDING SYSTEM VALUE VALUES (1, 'adidas') ON CONFLICT DO NOTHING;
INSERT INTO public.brands (id, name) OVERRIDING SYSTEM VALUE VALUES (2, 'puma') ON CONFLICT DO NOTHING;
INSERT INTO public.brands (id, name) OVERRIDING SYSTEM VALUE VALUES (3, 'Nike') ON CONFLICT DO NOTHING;


--
-- TOC entry 3795 (class 0 OID 16663)
-- Dependencies: 248
-- Data for Name: card_types; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.card_types (id, cart_type) OVERRIDING SYSTEM VALUE VALUES (1, 'mastercard') ON CONFLICT DO NOTHING;


--
-- TOC entry 3783 (class 0 OID 16543)
-- Dependencies: 236
-- Data for Name: cart_items; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cart_items (id, product_id, shopping_cart_id, item_count, price) OVERRIDING SYSTEM VALUE VALUES (6, 2, 2, 1, 1) ON CONFLICT DO NOTHING;


--
-- TOC entry 3777 (class 0 OID 16491)
-- Dependencies: 230
-- Data for Name: categories; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.categories (id, name) OVERRIDING SYSTEM VALUE VALUES (1, 'giyim') ON CONFLICT DO NOTHING;
INSERT INTO public.categories (id, name) OVERRIDING SYSTEM VALUE VALUES (2, 'teknoloji') ON CONFLICT DO NOTHING;


--
-- TOC entry 3765 (class 0 OID 16408)
-- Dependencies: 218
-- Data for Name: cities; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cities (id, country_id, name) OVERRIDING SYSTEM VALUE VALUES (1, 1, 'Ankara') ON CONFLICT DO NOTHING;


--
-- TOC entry 3763 (class 0 OID 16400)
-- Dependencies: 216
-- Data for Name: countries; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.countries (id, name) OVERRIDING SYSTEM VALUE VALUES (1, 'Turkey') ON CONFLICT DO NOTHING;


--
-- TOC entry 3771 (class 0 OID 16442)
-- Dependencies: 224
-- Data for Name: customers; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.customers (id, user_id) OVERRIDING SYSTEM VALUE VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.customers (id, user_id) OVERRIDING SYSTEM VALUE VALUES (2, 4) ON CONFLICT DO NOTHING;


--
-- TOC entry 3767 (class 0 OID 16421)
-- Dependencies: 220
-- Data for Name: disticies; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.disticies (id, city_id, name) OVERRIDING SYSTEM VALUE VALUES (1, 1, 'Beypazari') ON CONFLICT DO NOTHING;


--
-- TOC entry 3787 (class 0 OID 16600)
-- Dependencies: 240
-- Data for Name: order_items; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.order_items (id, product_id, order_id, product_count, price) OVERRIDING SYSTEM VALUE VALUES (1, 2, 1, 1, 150) ON CONFLICT DO NOTHING;


--
-- TOC entry 3785 (class 0 OID 16559)
-- Dependencies: 238
-- Data for Name: orders; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.orders (id, customer_id, date, total_price, address_id) OVERRIDING SYSTEM VALUE VALUES (1, 1, '15/15/15', '100', 1) ON CONFLICT DO NOTHING;


--
-- TOC entry 3801 (class 0 OID 16687)
-- Dependencies: 254
-- Data for Name: payment_cards; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.payment_cards (id, card_type_id, payment_method_id, customer_bank_id, seller_bank_id, payment_id, amount, installment_count, status) OVERRIDING SYSTEM VALUE VALUES (1, 1, 1, 1, 1, 1, 150, 3, 'done') ON CONFLICT DO NOTHING;


--
-- TOC entry 3797 (class 0 OID 16671)
-- Dependencies: 250
-- Data for Name: payment_methods; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.payment_methods (id, payment_method) OVERRIDING SYSTEM VALUE VALUES (1, '3d') ON CONFLICT DO NOTHING;


--
-- TOC entry 3793 (class 0 OID 16652)
-- Dependencies: 246
-- Data for Name: payments; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.payments (id, order_id, total_amount) OVERRIDING SYSTEM VALUE VALUES (1, 1, 150) ON CONFLICT DO NOTHING;


--
-- TOC entry 3779 (class 0 OID 16516)
-- Dependencies: 232
-- Data for Name: product_suppliers; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.product_suppliers (id, suppliers_id, product_id, stock) OVERRIDING SYSTEM VALUE VALUES (1, 1, 2, 150) ON CONFLICT DO NOTHING;


--
-- TOC entry 3805 (class 0 OID 17032)
-- Dependencies: 258
-- Data for Name: products; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.products (id, category_id, brand_id, name, description, price, stock) OVERRIDING SYSTEM VALUE VALUES (2, 1, 1, 'ayakkabı', 'fena ayakkabı', 15, 5) ON CONFLICT DO NOTHING;
INSERT INTO public.products (id, category_id, brand_id, name, description, price, stock) OVERRIDING SYSTEM VALUE VALUES (3, 1, 1, 'pantolon', 'pantolon iyiimiş', 15, 15) ON CONFLICT DO NOTHING;
INSERT INTO public.products (id, category_id, brand_id, name, description, price, stock) OVERRIDING SYSTEM VALUE VALUES (4, 2, 3, 'Teknolojik Nike ürünü', 'Nike ürünü ama teknolojik', 29.99, 100) ON CONFLICT DO NOTHING;
INSERT INTO public.products (id, category_id, brand_id, name, description, price, stock) OVERRIDING SYSTEM VALUE VALUES (8, 1, 1, 'Teknolojik Nike ürünü', 'Nike ürünü ama teknolojik', 29.99, 0) ON CONFLICT DO NOTHING;
INSERT INTO public.products (id, category_id, brand_id, name, description, price, stock) OVERRIDING SYSTEM VALUE VALUES (9, 1, 2, 'Teknolojik Nike ürünü', 'Nike ürünü ama teknolojik', 29.99, 100) ON CONFLICT DO NOTHING;
INSERT INTO public.products (id, category_id, brand_id, name, description, price, stock) OVERRIDING SYSTEM VALUE VALUES (10, 1, 2, 'Teknolojik Nike ürünü', 'Nike ürünü ama teknolojik', 0.99, 100) ON CONFLICT DO NOTHING;


--
-- TOC entry 3791 (class 0 OID 16634)
-- Dependencies: 244
-- Data for Name: reviews; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.reviews (id, user_id, product_id, comment, rating) OVERRIDING SYSTEM VALUE VALUES (2, 1, 2, 'comemnt ', 10) ON CONFLICT DO NOTHING;
INSERT INTO public.reviews (id, user_id, product_id, comment, rating) OVERRIDING SYSTEM VALUE VALUES (4, 1, 2, 'güzelmişş', 7) ON CONFLICT DO NOTHING;


--
-- TOC entry 3781 (class 0 OID 16532)
-- Dependencies: 234
-- Data for Name: shopping_carts; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.shopping_carts (id, user_id, total_price) OVERRIDING SYSTEM VALUE VALUES (2, 1, 100) ON CONFLICT DO NOTHING;
INSERT INTO public.shopping_carts (id, user_id, total_price) OVERRIDING SYSTEM VALUE VALUES (3, 1, 150) ON CONFLICT DO NOTHING;


--
-- TOC entry 3773 (class 0 OID 16453)
-- Dependencies: 226
-- Data for Name: suppliers; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.suppliers (id, user_id, tax_number) OVERRIDING SYSTEM VALUE VALUES (1, 1, '17000') ON CONFLICT DO NOTHING;
INSERT INTO public.suppliers (id, user_id, tax_number) OVERRIDING SYSTEM VALUE VALUES (3, 6, '1447636971') ON CONFLICT DO NOTHING;


--
-- TOC entry 3769 (class 0 OID 16434)
-- Dependencies: 222
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.users (id, name, surname, email, password, last_login_date, register_date) OVERRIDING SYSTEM VALUE VALUES (1, 'ahmet', 'yigit', 'yigit.ahmet@turkcell.com.tr', 'password', '12/12/2023', '12/12/2023') ON CONFLICT DO NOTHING;
INSERT INTO public.users (id, name, surname, email, password, last_login_date, register_date) OVERRIDING SYSTEM VALUE VALUES (4, 'ahmet', 'yiğit', 'ahmet_yigit_02@hotmail.com', 'hasheddata', '20/12/25', '12/12/12') ON CONFLICT DO NOTHING;
INSERT INTO public.users (id, name, surname, email, password, last_login_date, register_date) OVERRIDING SYSTEM VALUE VALUES (6, 'supplierAhmet', 'supplierSoyad', 'suplier@hotmail.com', 'suplierPassowrd', '20/12/25', '12/12/12') ON CONFLICT DO NOTHING;


--
-- TOC entry 3789 (class 0 OID 16616)
-- Dependencies: 242
-- Data for Name: wish_list; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.wish_list (id, user_id, product_id, added_date) OVERRIDING SYSTEM VALUE VALUES (2, 1, 2, '15/20/25') ON CONFLICT DO NOTHING;


--
-- TOC entry 3813 (class 0 OID 0)
-- Dependencies: 227
-- Name: Addreses_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Addreses_id_seq"', 1, true);


--
-- TOC entry 3814 (class 0 OID 0)
-- Dependencies: 235
-- Name: CartItems_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."CartItems_id_seq"', 6, true);


--
-- TOC entry 3815 (class 0 OID 0)
-- Dependencies: 229
-- Name: Categories_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Categories_id_seq"', 2, true);


--
-- TOC entry 3816 (class 0 OID 0)
-- Dependencies: 217
-- Name: Cities_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Cities_id_seq"', 2, true);


--
-- TOC entry 3817 (class 0 OID 0)
-- Dependencies: 215
-- Name: Countries_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Countries_id_seq"', 1, true);


--
-- TOC entry 3818 (class 0 OID 0)
-- Dependencies: 223
-- Name: Customer_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Customer_id_seq"', 2, true);


--
-- TOC entry 3819 (class 0 OID 0)
-- Dependencies: 219
-- Name: Disticies_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Disticies_id_seq"', 1, true);


--
-- TOC entry 3820 (class 0 OID 0)
-- Dependencies: 237
-- Name: ORDERS_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."ORDERS_id_seq"', 1, true);


--
-- TOC entry 3821 (class 0 OID 0)
-- Dependencies: 239
-- Name: OrderItems_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."OrderItems_id_seq"', 1, true);


--
-- TOC entry 3822 (class 0 OID 0)
-- Dependencies: 231
-- Name: ProductSuppliers_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."ProductSuppliers_id_seq"', 1, true);


--
-- TOC entry 3823 (class 0 OID 0)
-- Dependencies: 233
-- Name: ShoppingCarts_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."ShoppingCarts_id_seq"', 3, true);


--
-- TOC entry 3824 (class 0 OID 0)
-- Dependencies: 225
-- Name: Suppliers_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Suppliers_id_seq"', 3, true);


--
-- TOC entry 3825 (class 0 OID 0)
-- Dependencies: 221
-- Name: Users_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Users_id_seq"', 6, true);


--
-- TOC entry 3826 (class 0 OID 0)
-- Dependencies: 251
-- Name: banks_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.banks_id_seq', 1, true);


--
-- TOC entry 3827 (class 0 OID 0)
-- Dependencies: 255
-- Name: brands_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.brands_id_seq', 3, true);


--
-- TOC entry 3828 (class 0 OID 0)
-- Dependencies: 247
-- Name: card_types_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.card_types_id_seq', 1, true);


--
-- TOC entry 3829 (class 0 OID 0)
-- Dependencies: 253
-- Name: payment_cards_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.payment_cards_id_seq', 1, true);


--
-- TOC entry 3830 (class 0 OID 0)
-- Dependencies: 249
-- Name: payment_methods_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.payment_methods_id_seq', 1, true);


--
-- TOC entry 3831 (class 0 OID 0)
-- Dependencies: 245
-- Name: payments_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.payments_id_seq', 1, true);


--
-- TOC entry 3832 (class 0 OID 0)
-- Dependencies: 257
-- Name: products_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.products_id_seq', 10, true);


--
-- TOC entry 3833 (class 0 OID 0)
-- Dependencies: 243
-- Name: reviews_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.reviews_id_seq', 4, true);


--
-- TOC entry 3834 (class 0 OID 0)
-- Dependencies: 241
-- Name: wish_list_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.wish_list_id_seq', 2, true);


-- Completed on 2024-03-09 17:01:51 +03

--
-- PostgreSQL database dump complete
--

