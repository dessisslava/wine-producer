--
-- PostgreSQL database dump
--

-- Dumped from database version 9.2.4
-- Dumped by pg_dump version 9.3.4
-- Started on 2014-05-21 03:57:46

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

DROP DATABASE "winepro_db_v1.0";
--
-- TOC entry 2036 (class 1262 OID 47114)
-- Name: winepro_db_v1.0; Type: DATABASE; Schema: -; Owner: -
--

CREATE DATABASE "winepro_db_v1.0" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8';


\connect "winepro_db_v1.0"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 6 (class 2615 OID 47115)
-- Name: labs; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA labs;


--
-- TOC entry 7 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA public;


--
-- TOC entry 2037 (class 0 OID 0)
-- Dependencies: 7
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON SCHEMA public IS 'standard public schema';


--
-- TOC entry 183 (class 3079 OID 11769)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2039 (class 0 OID 0)
-- Dependencies: 183
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = labs, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 169 (class 1259 OID 47116)
-- Name: availability; Type: TABLE; Schema: labs; Owner: -; Tablespace: 
--

CREATE TABLE availability (
    product_id integer NOT NULL,
    amount integer NOT NULL,
    availability_threshold integer NOT NULL,
    CONSTRAINT "Availability_amount_check" CHECK ((amount >= 0))
);


--
-- TOC entry 170 (class 1259 OID 47120)
-- Name: order; Type: TABLE; Schema: labs; Owner: -; Tablespace: 
--

CREATE TABLE "order" (
    id integer NOT NULL,
    status smallint NOT NULL
);


--
-- TOC entry 171 (class 1259 OID 47123)
-- Name: order_id_seq; Type: SEQUENCE; Schema: labs; Owner: -
--

CREATE SEQUENCE order_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2040 (class 0 OID 0)
-- Dependencies: 171
-- Name: order_id_seq; Type: SEQUENCE OWNED BY; Schema: labs; Owner: -
--

ALTER SEQUENCE order_id_seq OWNED BY "order".id;


--
-- TOC entry 172 (class 1259 OID 47125)
-- Name: order_order_id_seq; Type: SEQUENCE; Schema: labs; Owner: -
--

CREATE SEQUENCE order_order_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 173 (class 1259 OID 47127)
-- Name: order_product; Type: TABLE; Schema: labs; Owner: -; Tablespace: 
--

CREATE TABLE order_product (
    order_id integer NOT NULL,
    product_id integer NOT NULL,
    amount integer NOT NULL,
    id integer NOT NULL
);


--
-- TOC entry 174 (class 1259 OID 47130)
-- Name: order_product_id_seq; Type: SEQUENCE; Schema: labs; Owner: -
--

CREATE SEQUENCE order_product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2041 (class 0 OID 0)
-- Dependencies: 174
-- Name: order_product_id_seq; Type: SEQUENCE OWNED BY; Schema: labs; Owner: -
--

ALTER SEQUENCE order_product_id_seq OWNED BY order_product.id;


--
-- TOC entry 175 (class 1259 OID 47132)
-- Name: product; Type: TABLE; Schema: labs; Owner: -; Tablespace: 
--

CREATE TABLE product (
    id integer NOT NULL,
    product character varying(100) NOT NULL,
    producer character varying(50) NOT NULL,
    weight real NOT NULL,
    price real NOT NULL,
    image_name character varying(200) NOT NULL
);


--
-- TOC entry 176 (class 1259 OID 47135)
-- Name: product_id_seq; Type: SEQUENCE; Schema: labs; Owner: -
--

CREATE SEQUENCE product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2042 (class 0 OID 0)
-- Dependencies: 176
-- Name: product_id_seq; Type: SEQUENCE OWNED BY; Schema: labs; Owner: -
--

ALTER SEQUENCE product_id_seq OWNED BY product.id;


--
-- TOC entry 177 (class 1259 OID 47137)
-- Name: resupply_order; Type: TABLE; Schema: labs; Owner: -; Tablespace: 
--

CREATE TABLE resupply_order (
    status smallint NOT NULL,
    expected_available_date date NOT NULL,
    id integer NOT NULL
);


--
-- TOC entry 178 (class 1259 OID 47140)
-- Name: resupply_order_id_seq; Type: SEQUENCE; Schema: labs; Owner: -
--

CREATE SEQUENCE resupply_order_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 179 (class 1259 OID 47142)
-- Name: resupply_order_id_seq1; Type: SEQUENCE; Schema: labs; Owner: -
--

CREATE SEQUENCE resupply_order_id_seq1
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2043 (class 0 OID 0)
-- Dependencies: 179
-- Name: resupply_order_id_seq1; Type: SEQUENCE OWNED BY; Schema: labs; Owner: -
--

ALTER SEQUENCE resupply_order_id_seq1 OWNED BY resupply_order.id;


--
-- TOC entry 180 (class 1259 OID 47144)
-- Name: resupply_order_product; Type: TABLE; Schema: labs; Owner: -; Tablespace: 
--

CREATE TABLE resupply_order_product (
    resupply_order_id integer NOT NULL,
    product_id integer NOT NULL,
    amount integer NOT NULL,
    id integer NOT NULL
);


--
-- TOC entry 181 (class 1259 OID 47147)
-- Name: resupply_order_product_id_seq; Type: SEQUENCE; Schema: labs; Owner: -
--

CREATE SEQUENCE resupply_order_product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2044 (class 0 OID 0)
-- Dependencies: 181
-- Name: resupply_order_product_id_seq; Type: SEQUENCE OWNED BY; Schema: labs; Owner: -
--

ALTER SEQUENCE resupply_order_product_id_seq OWNED BY resupply_order_product.id;


SET default_with_oids = true;

--
-- TOC entry 182 (class 1259 OID 47149)
-- Name: user; Type: TABLE; Schema: labs; Owner: -; Tablespace: 
--

CREATE TABLE "user" (
    name character varying(30) NOT NULL,
    password character varying(32) NOT NULL,
    active boolean DEFAULT true NOT NULL,
    email_address character varying(75) NOT NULL,
    first_name character varying(75) NOT NULL,
    middle_name character varying(75) DEFAULT NULL::character varying,
    last_name character varying(75) NOT NULL
);


--
-- TOC entry 1888 (class 2604 OID 47154)
-- Name: id; Type: DEFAULT; Schema: labs; Owner: -
--

ALTER TABLE ONLY "order" ALTER COLUMN id SET DEFAULT nextval('order_id_seq'::regclass);


--
-- TOC entry 1889 (class 2604 OID 47155)
-- Name: id; Type: DEFAULT; Schema: labs; Owner: -
--

ALTER TABLE ONLY order_product ALTER COLUMN id SET DEFAULT nextval('order_product_id_seq'::regclass);


--
-- TOC entry 1890 (class 2604 OID 47156)
-- Name: id; Type: DEFAULT; Schema: labs; Owner: -
--

ALTER TABLE ONLY product ALTER COLUMN id SET DEFAULT nextval('product_id_seq'::regclass);


--
-- TOC entry 1891 (class 2604 OID 47157)
-- Name: id; Type: DEFAULT; Schema: labs; Owner: -
--

ALTER TABLE ONLY resupply_order ALTER COLUMN id SET DEFAULT nextval('resupply_order_id_seq1'::regclass);


--
-- TOC entry 1892 (class 2604 OID 47158)
-- Name: id; Type: DEFAULT; Schema: labs; Owner: -
--

ALTER TABLE ONLY resupply_order_product ALTER COLUMN id SET DEFAULT nextval('resupply_order_product_id_seq'::regclass);


--
-- TOC entry 2018 (class 0 OID 47116)
-- Dependencies: 169
-- Data for Name: availability; Type: TABLE DATA; Schema: labs; Owner: -
--



--
-- TOC entry 2019 (class 0 OID 47120)
-- Dependencies: 170
-- Data for Name: order; Type: TABLE DATA; Schema: labs; Owner: -
--

INSERT INTO "order" VALUES (1, 9);


--
-- TOC entry 2045 (class 0 OID 0)
-- Dependencies: 171
-- Name: order_id_seq; Type: SEQUENCE SET; Schema: labs; Owner: -
--

SELECT pg_catalog.setval('order_id_seq', 1, true);


--
-- TOC entry 2046 (class 0 OID 0)
-- Dependencies: 172
-- Name: order_order_id_seq; Type: SEQUENCE SET; Schema: labs; Owner: -
--

SELECT pg_catalog.setval('order_order_id_seq', 13, true);


--
-- TOC entry 2022 (class 0 OID 47127)
-- Dependencies: 173
-- Data for Name: order_product; Type: TABLE DATA; Schema: labs; Owner: -
--



--
-- TOC entry 2047 (class 0 OID 0)
-- Dependencies: 174
-- Name: order_product_id_seq; Type: SEQUENCE SET; Schema: labs; Owner: -
--

SELECT pg_catalog.setval('order_product_id_seq', 1, false);


--
-- TOC entry 2024 (class 0 OID 47132)
-- Dependencies: 175
-- Data for Name: product; Type: TABLE DATA; Schema: labs; Owner: -
--

INSERT INTO product VALUES (7, 'SDRW-08D2S-U Lite 8X External SLIM DVD Writer', 'ASUS', 0.300000012, 32, 'asus2.jpg');
INSERT INTO product VALUES (4, 'ELITE RC-430 500W MidT ATX Case', 'COOLER MASTER ', 1.39999998, 174, 'cooler2.jpg');
INSERT INTO product VALUES (3, 'HAF 912 ADVANCE GX 80PLUS 750W MidT ATX Case', 'COOLER MASTER ', 1.20000005, 74, 'cooler1.jpg');
INSERT INTO product VALUES (8, 'GTX670 DirectCU II GDDR5 4GB 256Bit Nvidia GeForce DX11.1 Graphic Card', 'ASUS', 0.400000006, 473, 'asus1.jpg');
INSERT INTO product VALUES (12, 'F5 V-TRACK KABLOLU GAMER MOUSE - BLACK', 'A4 TECH', 0.400000006, 20, 'a4tech1.jpg');
INSERT INTO product VALUES (13, 'GE60 NOTEBOOK CORE I7 2.40 GHZ-16GB-1TB-15.6-2GB-W8 Notebook', 'MSI', 3.20000005, 1285, 'msi1.jpg');
INSERT INTO product VALUES (15, 'Core i7 4770K Soket 1150 3.5GHz 8MB Cache 22nm CPU', 'INTEL', 0.200000003, 335, 'intel1.jpg');
INSERT INTO product VALUES (16, 'X3000 300MBPS KABLOSUZ-N 4 PORT ADSL2+ MODEM', 'LINKSYS', 0.349999994, 81, 'linksys1.jpg');
INSERT INTO product VALUES (9, '3.5 inch 1TB Barracuda Sata 3.0 64MB Cache 7200Rpm Harddisk', 'SEAGATE', 0.699999988, 62, 'seagate1.jpg');
INSERT INTO product VALUES (10, '27 inch S27C750P Wide Srceen LED Monitor', 'SAMSUNG', 1.79999995, 391, 'samsung1.jpg');


--
-- TOC entry 2048 (class 0 OID 0)
-- Dependencies: 176
-- Name: product_id_seq; Type: SEQUENCE SET; Schema: labs; Owner: -
--

SELECT pg_catalog.setval('product_id_seq', 16, true);


--
-- TOC entry 2026 (class 0 OID 47137)
-- Dependencies: 177
-- Data for Name: resupply_order; Type: TABLE DATA; Schema: labs; Owner: -
--



--
-- TOC entry 2049 (class 0 OID 0)
-- Dependencies: 178
-- Name: resupply_order_id_seq; Type: SEQUENCE SET; Schema: labs; Owner: -
--

SELECT pg_catalog.setval('resupply_order_id_seq', 4, true);


--
-- TOC entry 2050 (class 0 OID 0)
-- Dependencies: 179
-- Name: resupply_order_id_seq1; Type: SEQUENCE SET; Schema: labs; Owner: -
--

SELECT pg_catalog.setval('resupply_order_id_seq1', 1, false);


--
-- TOC entry 2029 (class 0 OID 47144)
-- Dependencies: 180
-- Data for Name: resupply_order_product; Type: TABLE DATA; Schema: labs; Owner: -
--



--
-- TOC entry 2051 (class 0 OID 0)
-- Dependencies: 181
-- Name: resupply_order_product_id_seq; Type: SEQUENCE SET; Schema: labs; Owner: -
--

SELECT pg_catalog.setval('resupply_order_product_id_seq', 1, false);


--
-- TOC entry 2031 (class 0 OID 47149)
-- Dependencies: 182
-- Data for Name: user; Type: TABLE DATA; Schema: labs; Owner: -
--

INSERT INTO "user" VALUES ('admin', 'admin', true, 'admin@alaz.biz', 'Admin', 'The', 'Almighty');


--
-- TOC entry 1896 (class 2606 OID 47161)
-- Name: availability_pkey; Type: CONSTRAINT; Schema: labs; Owner: -; Tablespace: 
--

ALTER TABLE ONLY availability
    ADD CONSTRAINT availability_pkey PRIMARY KEY (product_id);


--
-- TOC entry 1898 (class 2606 OID 47163)
-- Name: order_pkey; Type: CONSTRAINT; Schema: labs; Owner: -; Tablespace: 
--

ALTER TABLE ONLY "order"
    ADD CONSTRAINT order_pkey PRIMARY KEY (id);


--
-- TOC entry 1900 (class 2606 OID 47165)
-- Name: order_product_pkey; Type: CONSTRAINT; Schema: labs; Owner: -; Tablespace: 
--

ALTER TABLE ONLY order_product
    ADD CONSTRAINT order_product_pkey PRIMARY KEY (id);


--
-- TOC entry 1908 (class 2606 OID 47167)
-- Name: pk_tb_user_name; Type: CONSTRAINT; Schema: labs; Owner: -; Tablespace: 
--

ALTER TABLE ONLY "user"
    ADD CONSTRAINT pk_tb_user_name PRIMARY KEY (name);


--
-- TOC entry 1902 (class 2606 OID 47169)
-- Name: product_pkey; Type: CONSTRAINT; Schema: labs; Owner: -; Tablespace: 
--

ALTER TABLE ONLY product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);


--
-- TOC entry 1904 (class 2606 OID 47171)
-- Name: resupply_order_pkey; Type: CONSTRAINT; Schema: labs; Owner: -; Tablespace: 
--

ALTER TABLE ONLY resupply_order
    ADD CONSTRAINT resupply_order_pkey PRIMARY KEY (id);


--
-- TOC entry 1906 (class 2606 OID 47173)
-- Name: resupply_order_product_pkey; Type: CONSTRAINT; Schema: labs; Owner: -; Tablespace: 
--

ALTER TABLE ONLY resupply_order_product
    ADD CONSTRAINT resupply_order_product_pkey PRIMARY KEY (id);


--
-- TOC entry 1909 (class 2606 OID 47174)
-- Name: availability_product_id_fkey; Type: FK CONSTRAINT; Schema: labs; Owner: -
--

ALTER TABLE ONLY availability
    ADD CONSTRAINT availability_product_id_fkey FOREIGN KEY (product_id) REFERENCES product(id);


--
-- TOC entry 1910 (class 2606 OID 47179)
-- Name: order_product_order_id_fkey; Type: FK CONSTRAINT; Schema: labs; Owner: -
--

ALTER TABLE ONLY order_product
    ADD CONSTRAINT order_product_order_id_fkey FOREIGN KEY (order_id) REFERENCES "order"(id);


--
-- TOC entry 1911 (class 2606 OID 47184)
-- Name: resupply_order_product_resupply_order_id_fkey; Type: FK CONSTRAINT; Schema: labs; Owner: -
--

ALTER TABLE ONLY resupply_order_product
    ADD CONSTRAINT resupply_order_product_resupply_order_id_fkey FOREIGN KEY (resupply_order_id) REFERENCES resupply_order(id);


--
-- TOC entry 2038 (class 0 OID 0)
-- Dependencies: 7
-- Name: public; Type: ACL; Schema: -; Owner: -
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2014-05-21 03:57:47

--
-- PostgreSQL database dump complete
--

