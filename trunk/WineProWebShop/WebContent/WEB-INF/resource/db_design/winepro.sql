--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.4
-- Dumped by pg_dump version 9.3.4
-- Started on 2014-06-19 00:16:33

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 2059 (class 1262 OID 24576)
-- Name: winepro_db_v1.0; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "winepro_db_v1.0" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Turkish_Turkey.1254' LC_CTYPE = 'Turkish_Turkey.1254';


ALTER DATABASE "winepro_db_v1.0" OWNER TO postgres;

\connect "winepro_db_v1.0"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 7 (class 2615 OID 24656)
-- Name: winepro; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA winepro;


ALTER SCHEMA winepro OWNER TO postgres;

--
-- TOC entry 188 (class 3079 OID 11750)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2062 (class 0 OID 0)
-- Dependencies: 188
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = winepro, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 171 (class 1259 OID 24657)
-- Name: tb_address; Type: TABLE; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_address (
    fl_id integer NOT NULL,
    fl_region character varying(200) DEFAULT 'Crete'::character varying NOT NULL,
    fl_address character varying(500) NOT NULL,
    fl_postal_code character varying(20),
    fl_phone_number character varying(20),
    fl_city_name character varying(100) NOT NULL
);


ALTER TABLE winepro.tb_address OWNER TO postgres;

--
-- TOC entry 172 (class 1259 OID 24660)
-- Name: tb_address_fl_id_seq; Type: SEQUENCE; Schema: winepro; Owner: postgres
--

CREATE SEQUENCE tb_address_fl_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE winepro.tb_address_fl_id_seq OWNER TO postgres;

--
-- TOC entry 2063 (class 0 OID 0)
-- Dependencies: 172
-- Name: tb_address_fl_id_seq; Type: SEQUENCE OWNED BY; Schema: winepro; Owner: postgres
--

ALTER SEQUENCE tb_address_fl_id_seq OWNED BY tb_address.fl_id;


--
-- TOC entry 173 (class 1259 OID 24667)
-- Name: tb_inventory; Type: TABLE; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_inventory (
    fl_id integer NOT NULL,
    fl_wine_id integer NOT NULL,
    fl_amount integer DEFAULT 0 NOT NULL,
    fl_warehouse_id integer NOT NULL,
    fl_reserved_amount integer DEFAULT 0 NOT NULL,
    CONSTRAINT check_fl_amount CHECK ((fl_amount >= 0))
);


ALTER TABLE winepro.tb_inventory OWNER TO postgres;

--
-- TOC entry 174 (class 1259 OID 24672)
-- Name: tb_inventory_fl_id_seq; Type: SEQUENCE; Schema: winepro; Owner: postgres
--

CREATE SEQUENCE tb_inventory_fl_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE winepro.tb_inventory_fl_id_seq OWNER TO postgres;

--
-- TOC entry 2064 (class 0 OID 0)
-- Dependencies: 174
-- Name: tb_inventory_fl_id_seq; Type: SEQUENCE OWNED BY; Schema: winepro; Owner: postgres
--

ALTER SEQUENCE tb_inventory_fl_id_seq OWNED BY tb_inventory.fl_id;


--
-- TOC entry 175 (class 1259 OID 24674)
-- Name: tb_order; Type: TABLE; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_order (
    fl_id bigint NOT NULL,
    fl_status smallint DEFAULT 0 NOT NULL,
    fl_order_date timestamp without time zone DEFAULT now() NOT NULL,
    fl_total_price_of_goods numeric NOT NULL,
    fl_transportation_cost numeric DEFAULT 0 NOT NULL,
    fl_transportation_company_id integer DEFAULT (-1),
    fl_customer_name character varying(30) NOT NULL,
    fl_payment_info_id bigint DEFAULT (-1)
);


ALTER TABLE winepro.tb_order OWNER TO postgres;

--
-- TOC entry 176 (class 1259 OID 24680)
-- Name: tb_order_fl_id_seq; Type: SEQUENCE; Schema: winepro; Owner: postgres
--

CREATE SEQUENCE tb_order_fl_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE winepro.tb_order_fl_id_seq OWNER TO postgres;

--
-- TOC entry 2065 (class 0 OID 0)
-- Dependencies: 176
-- Name: tb_order_fl_id_seq; Type: SEQUENCE OWNED BY; Schema: winepro; Owner: postgres
--

ALTER SEQUENCE tb_order_fl_id_seq OWNED BY tb_order.fl_id;


--
-- TOC entry 177 (class 1259 OID 24684)
-- Name: tb_payment_info; Type: TABLE; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_payment_info (
    fl_id bigint NOT NULL,
    fl_name_surname character varying(26) NOT NULL,
    fl_expiration_date date NOT NULL,
    fl_number character(16) NOT NULL,
    fl_security_code smallint NOT NULL,
    fl_transaction_date date DEFAULT now() NOT NULL,
    fl_credit_card_type smallint NOT NULL,
    fl_status smallint DEFAULT 0 NOT NULL,
    fl_payment_amount numeric DEFAULT 0 NOT NULL
);


ALTER TABLE winepro.tb_payment_info OWNER TO postgres;

--
-- TOC entry 178 (class 1259 OID 24687)
-- Name: tb_payment_info_fl_id_seq; Type: SEQUENCE; Schema: winepro; Owner: postgres
--

CREATE SEQUENCE tb_payment_info_fl_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE winepro.tb_payment_info_fl_id_seq OWNER TO postgres;

--
-- TOC entry 2066 (class 0 OID 0)
-- Dependencies: 178
-- Name: tb_payment_info_fl_id_seq; Type: SEQUENCE OWNED BY; Schema: winepro; Owner: postgres
--

ALTER SEQUENCE tb_payment_info_fl_id_seq OWNED BY tb_payment_info.fl_id;


--
-- TOC entry 179 (class 1259 OID 24689)
-- Name: tb_transportation_company; Type: TABLE; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_transportation_company (
    fl_id integer NOT NULL,
    fl_name character varying(50) NOT NULL,
    fl_ws_connection_link text,
    fl_active boolean DEFAULT false NOT NULL
);


ALTER TABLE winepro.tb_transportation_company OWNER TO postgres;

--
-- TOC entry 180 (class 1259 OID 24692)
-- Name: tb_transportation_company_fl_id_seq; Type: SEQUENCE; Schema: winepro; Owner: postgres
--

CREATE SEQUENCE tb_transportation_company_fl_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE winepro.tb_transportation_company_fl_id_seq OWNER TO postgres;

--
-- TOC entry 2067 (class 0 OID 0)
-- Dependencies: 180
-- Name: tb_transportation_company_fl_id_seq; Type: SEQUENCE OWNED BY; Schema: winepro; Owner: postgres
--

ALTER SEQUENCE tb_transportation_company_fl_id_seq OWNED BY tb_transportation_company.fl_id;


SET default_with_oids = true;

--
-- TOC entry 181 (class 1259 OID 24694)
-- Name: tb_user; Type: TABLE; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_user (
    name character varying(30) NOT NULL,
    password character varying(32) NOT NULL,
    active boolean DEFAULT true NOT NULL,
    email_address character varying(75) NOT NULL,
    first_name character varying(75) NOT NULL,
    middle_name character varying(75) DEFAULT NULL::character varying,
    last_name character varying(75) NOT NULL,
    role_name character varying(100) NOT NULL
);


ALTER TABLE winepro.tb_user OWNER TO postgres;

SET default_with_oids = false;

--
-- TOC entry 182 (class 1259 OID 24699)
-- Name: tb_warehouse; Type: TABLE; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_warehouse (
    fl_id integer NOT NULL,
    fl_address_id integer NOT NULL,
    fl_name character varying(100) NOT NULL
);


ALTER TABLE winepro.tb_warehouse OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 24702)
-- Name: tb_warehouse_fl_id_seq; Type: SEQUENCE; Schema: winepro; Owner: postgres
--

CREATE SEQUENCE tb_warehouse_fl_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE winepro.tb_warehouse_fl_id_seq OWNER TO postgres;

--
-- TOC entry 2068 (class 0 OID 0)
-- Dependencies: 183
-- Name: tb_warehouse_fl_id_seq; Type: SEQUENCE OWNED BY; Schema: winepro; Owner: postgres
--

ALTER SEQUENCE tb_warehouse_fl_id_seq OWNED BY tb_warehouse.fl_id;


--
-- TOC entry 184 (class 1259 OID 24704)
-- Name: tb_wine; Type: TABLE; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_wine (
    fl_id integer NOT NULL,
    fl_production_date date DEFAULT '2014-01-01'::date NOT NULL,
    fl_type character varying(20) DEFAULT 'Red Wine'::character varying NOT NULL,
    fl_price numeric NOT NULL,
    fl_weight real NOT NULL,
    fl_image_url character varying(200),
    fl_name character varying(100) NOT NULL
);


ALTER TABLE winepro.tb_wine OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 24709)
-- Name: tb_wine_fl_id_seq; Type: SEQUENCE; Schema: winepro; Owner: postgres
--

CREATE SEQUENCE tb_wine_fl_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE winepro.tb_wine_fl_id_seq OWNER TO postgres;

--
-- TOC entry 2069 (class 0 OID 0)
-- Dependencies: 185
-- Name: tb_wine_fl_id_seq; Type: SEQUENCE OWNED BY; Schema: winepro; Owner: postgres
--

ALTER SEQUENCE tb_wine_fl_id_seq OWNED BY tb_wine.fl_id;


--
-- TOC entry 186 (class 1259 OID 24711)
-- Name: tb_wine_order; Type: TABLE; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_wine_order (
    fl_id integer NOT NULL,
    fl_order_id integer NOT NULL,
    fl_wine_id integer NOT NULL,
    fl_amount integer NOT NULL,
    fl_unit_price numeric NOT NULL,
    fl_status character varying(20) NOT NULL,
    fl_last_change_date time with time zone DEFAULT now() NOT NULL
);


ALTER TABLE winepro.tb_wine_order OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 24714)
-- Name: tb_wine_order_fl_id_seq; Type: SEQUENCE; Schema: winepro; Owner: postgres
--

CREATE SEQUENCE tb_wine_order_fl_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE winepro.tb_wine_order_fl_id_seq OWNER TO postgres;

--
-- TOC entry 2070 (class 0 OID 0)
-- Dependencies: 187
-- Name: tb_wine_order_fl_id_seq; Type: SEQUENCE OWNED BY; Schema: winepro; Owner: postgres
--

ALTER SEQUENCE tb_wine_order_fl_id_seq OWNED BY tb_wine_order.fl_id;


--
-- TOC entry 1876 (class 2604 OID 24716)
-- Name: fl_id; Type: DEFAULT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_address ALTER COLUMN fl_id SET DEFAULT nextval('tb_address_fl_id_seq'::regclass);


--
-- TOC entry 1879 (class 2604 OID 24718)
-- Name: fl_id; Type: DEFAULT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_inventory ALTER COLUMN fl_id SET DEFAULT nextval('tb_inventory_fl_id_seq'::regclass);


--
-- TOC entry 1885 (class 2604 OID 24875)
-- Name: fl_id; Type: DEFAULT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_order ALTER COLUMN fl_id SET DEFAULT nextval('tb_order_fl_id_seq'::regclass);


--
-- TOC entry 1888 (class 2604 OID 24720)
-- Name: fl_id; Type: DEFAULT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_payment_info ALTER COLUMN fl_id SET DEFAULT nextval('tb_payment_info_fl_id_seq'::regclass);


--
-- TOC entry 1892 (class 2604 OID 24721)
-- Name: fl_id; Type: DEFAULT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_transportation_company ALTER COLUMN fl_id SET DEFAULT nextval('tb_transportation_company_fl_id_seq'::regclass);


--
-- TOC entry 1896 (class 2604 OID 24722)
-- Name: fl_id; Type: DEFAULT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_warehouse ALTER COLUMN fl_id SET DEFAULT nextval('tb_warehouse_fl_id_seq'::regclass);


--
-- TOC entry 1898 (class 2604 OID 24723)
-- Name: fl_id; Type: DEFAULT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_wine ALTER COLUMN fl_id SET DEFAULT nextval('tb_wine_fl_id_seq'::regclass);


--
-- TOC entry 1900 (class 2604 OID 24724)
-- Name: fl_id; Type: DEFAULT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_wine_order ALTER COLUMN fl_id SET DEFAULT nextval('tb_wine_order_fl_id_seq'::regclass);


--
-- TOC entry 2038 (class 0 OID 24657)
-- Dependencies: 171
-- Data for Name: tb_address; Type: TABLE DATA; Schema: winepro; Owner: postgres
--

INSERT INTO tb_address VALUES (2, 'Crete', 'Bla bla', '1', '1', 'Heraklion');
INSERT INTO tb_address VALUES (4, 'Crete', 'Bla bla 2', '2', '2', 'Chania');
INSERT INTO tb_address VALUES (5, 'Crete', 'Bla bla 3', '3', '3', 'Rethimno');
INSERT INTO tb_address VALUES (6, 'Crete', 'Bla bla 4', '4', '4', 'Athens');


--
-- TOC entry 2071 (class 0 OID 0)
-- Dependencies: 172
-- Name: tb_address_fl_id_seq; Type: SEQUENCE SET; Schema: winepro; Owner: postgres
--

SELECT pg_catalog.setval('tb_address_fl_id_seq', 6, true);


--
-- TOC entry 2040 (class 0 OID 24667)
-- Dependencies: 173
-- Data for Name: tb_inventory; Type: TABLE DATA; Schema: winepro; Owner: postgres
--

INSERT INTO tb_inventory VALUES (2, 3, 27, 1, 23);
INSERT INTO tb_inventory VALUES (3, 4, 12, 1, 38);
INSERT INTO tb_inventory VALUES (4, 5, 30, 1, 20);
INSERT INTO tb_inventory VALUES (5, 6, 45, 1, 5);
INSERT INTO tb_inventory VALUES (7, 3, 32, 2, 18);
INSERT INTO tb_inventory VALUES (8, 4, 17, 2, 33);
INSERT INTO tb_inventory VALUES (10, 5, 40, 2, 10);
INSERT INTO tb_inventory VALUES (11, 6, 28, 2, 22);
INSERT INTO tb_inventory VALUES (12, 2, 43, 3, 7);
INSERT INTO tb_inventory VALUES (14, 3, 38, 3, 12);
INSERT INTO tb_inventory VALUES (15, 4, 50, 3, 0);
INSERT INTO tb_inventory VALUES (16, 5, 48, 3, 2);
INSERT INTO tb_inventory VALUES (17, 6, 21, 3, 29);
INSERT INTO tb_inventory VALUES (18, 2, 45, 4, 5);
INSERT INTO tb_inventory VALUES (19, 3, 45, 4, 5);
INSERT INTO tb_inventory VALUES (20, 4, 45, 4, 5);
INSERT INTO tb_inventory VALUES (21, 5, 45, 4, 5);
INSERT INTO tb_inventory VALUES (22, 6, 45, 4, 5);
INSERT INTO tb_inventory VALUES (6, 2, 8, 2, 42);
INSERT INTO tb_inventory VALUES (1, 2, 30, 1, 20);


--
-- TOC entry 2072 (class 0 OID 0)
-- Dependencies: 174
-- Name: tb_inventory_fl_id_seq; Type: SEQUENCE SET; Schema: winepro; Owner: postgres
--

SELECT pg_catalog.setval('tb_inventory_fl_id_seq', 22, true);


--
-- TOC entry 2042 (class 0 OID 24674)
-- Dependencies: 175
-- Data for Name: tb_order; Type: TABLE DATA; Schema: winepro; Owner: postgres
--



--
-- TOC entry 2073 (class 0 OID 0)
-- Dependencies: 176
-- Name: tb_order_fl_id_seq; Type: SEQUENCE SET; Schema: winepro; Owner: postgres
--

SELECT pg_catalog.setval('tb_order_fl_id_seq', 1, false);


--
-- TOC entry 2044 (class 0 OID 24684)
-- Dependencies: 177
-- Data for Name: tb_payment_info; Type: TABLE DATA; Schema: winepro; Owner: postgres
--



--
-- TOC entry 2074 (class 0 OID 0)
-- Dependencies: 178
-- Name: tb_payment_info_fl_id_seq; Type: SEQUENCE SET; Schema: winepro; Owner: postgres
--

SELECT pg_catalog.setval('tb_payment_info_fl_id_seq', 1, false);


--
-- TOC entry 2046 (class 0 OID 24689)
-- Dependencies: 179
-- Data for Name: tb_transportation_company; Type: TABLE DATA; Schema: winepro; Owner: postgres
--



--
-- TOC entry 2075 (class 0 OID 0)
-- Dependencies: 180
-- Name: tb_transportation_company_fl_id_seq; Type: SEQUENCE SET; Schema: winepro; Owner: postgres
--

SELECT pg_catalog.setval('tb_transportation_company_fl_id_seq', 1, false);


--
-- TOC entry 2048 (class 0 OID 24694)
-- Dependencies: 181
-- Data for Name: tb_user; Type: TABLE DATA; Schema: winepro; Owner: postgres
--

INSERT INTO tb_user VALUES ('admin', 'admin', true, 'admin@alaz.biz', 'Admin', 'The', 'Almighty', 'ADMIN');


--
-- TOC entry 2049 (class 0 OID 24699)
-- Dependencies: 182
-- Data for Name: tb_warehouse; Type: TABLE DATA; Schema: winepro; Owner: postgres
--

INSERT INTO tb_warehouse VALUES (1, 2, 'Heraklion Warehouse');
INSERT INTO tb_warehouse VALUES (2, 4, 'Chania Warehouse');
INSERT INTO tb_warehouse VALUES (4, 6, 'Athens Warehouse');
INSERT INTO tb_warehouse VALUES (3, 5, 'Rethimno Warehouse');


--
-- TOC entry 2076 (class 0 OID 0)
-- Dependencies: 183
-- Name: tb_warehouse_fl_id_seq; Type: SEQUENCE SET; Schema: winepro; Owner: postgres
--

SELECT pg_catalog.setval('tb_warehouse_fl_id_seq', 4, true);


--
-- TOC entry 2051 (class 0 OID 24704)
-- Dependencies: 184
-- Data for Name: tb_wine; Type: TABLE DATA; Schema: winepro; Owner: postgres
--

INSERT INTO tb_wine VALUES (26, '2014-01-01', 'White Wine', 11.00, 1.10000002, 'MacMurray.png', 'MacMurray');
INSERT INTO tb_wine VALUES (28, '2014-01-01', 'White Wine', 10.00, 1, 'Maso Canali.png', 'Maso Canali');
INSERT INTO tb_wine VALUES (5, '2010-01-01', 'White Champagne', 15.00, 1.5, 'Andre.png', 'Andre');
INSERT INTO tb_wine VALUES (6, '2011-01-01', 'White Champagne', 20.00, 2, 'Ballatore.png', 'Ballatore');
INSERT INTO tb_wine VALUES (8, '2011-01-01', 'White Wine', 14.00, 1.39999998, 'Bella Sera.png', 'Bella Sera');
INSERT INTO tb_wine VALUES (9, '2013-01-01', 'Red Wine', 11.00, 1.10000002, 'Black Swan.png', 'Black Swan');
INSERT INTO tb_wine VALUES (10, '2013-01-01', 'Red Wine', 12.00, 1.20000005, 'Burlwood.png', 'Burlwood');
INSERT INTO tb_wine VALUES (11, '2007-01-01', 'Brandy', 24.00, 2.4000001, 'Cognac.png', 'Cognac');
INSERT INTO tb_wine VALUES (13, '2011-01-01', 'White Wine', 13.00, 1.29999995, 'Copperidge.png', 'Copperidge');
INSERT INTO tb_wine VALUES (14, '2010-01-01', 'Rosé', 17.00, 1.70000005, 'E & J Gallo No. Sonoma Estate.png', 'E & J Gallo No. Sonoma Estate');
INSERT INTO tb_wine VALUES (16, '2007-01-01', 'Brandy', 24.00, 2.4000001, 'E. & J. VS.png', 'E. & J. VS');
INSERT INTO tb_wine VALUES (17, '2008-01-01', 'Brandy', 22.00, 2.20000005, 'E. & J. VSOP.png', 'E. & J. VSOP');
INSERT INTO tb_wine VALUES (18, '2010-01-01', 'Red Wine', 14.00, 1.39999998, 'Ecco Domani.png', 'Ecco Domani');
INSERT INTO tb_wine VALUES (19, '2009-01-01', 'Red Wine', 16.00, 1.60000002, 'Frei Bros. Reserve.png', 'Frei Bros. Reserve');
INSERT INTO tb_wine VALUES (20, '2010-01-01', 'Red Wine', 15.00, 1.5, 'Gallo of Sonoma.png', 'Gallo of Sonoma');
INSERT INTO tb_wine VALUES (21, '2008-01-01', 'Red Wine', 18.00, 1.79999995, 'GOS Single Vineyard.png', 'GOS Single Vineyard');
INSERT INTO tb_wine VALUES (22, '2007-01-01', 'Red Wine', 19.00, 1.89999998, 'Indigo Hills.png', 'Indigo Hills');
INSERT INTO tb_wine VALUES (25, '2001-01-01', 'Rosé', 21.00, 2.0999999, 'Livingston Cellars.png', 'Livingston Cellars');
INSERT INTO tb_wine VALUES (27, '2012-01-01', 'White Wine', 12.00, 1.20000005, 'Marcelina.png', 'Marcelina');
INSERT INTO tb_wine VALUES (29, '2011-01-01', 'Red Wine', 15.00, 1.5, 'McWilliams Hanwood Estate.png', 'McWilliams Hanwood Estate');
INSERT INTO tb_wine VALUES (30, '2007-01-01', 'Brandy', 19.00, 1.89999998, 'Patriarch.png', 'Patriarch');
INSERT INTO tb_wine VALUES (31, '2011-01-01', 'Red Wine', 15.00, 1.5, 'Rancho Zabaco.png', 'Rancho Zabaco');
INSERT INTO tb_wine VALUES (32, '2010-01-01', 'White Wine', 17.00, 1.70000005, 'Redwood Creek.png', 'Redwood Creek');
INSERT INTO tb_wine VALUES (33, '2001-01-01', 'Brandy', 23.00, 2.29999995, 'Single Vintage.png', 'Single Vintage');
INSERT INTO tb_wine VALUES (34, '2012-01-01', 'White Wine', 14.00, 1.39999998, 'Timberwood.png', 'Timberwood');
INSERT INTO tb_wine VALUES (36, '2010-01-01', 'White Wine', 16.00, 1.60000002, 'Turning Leaf Coastal.png', 'Turning Leaf Coastal');
INSERT INTO tb_wine VALUES (37, '2009-01-01', 'Red Wine', 18.00, 1.79999995, 'Turning Leaf.png', 'Turning Leaf');
INSERT INTO tb_wine VALUES (38, '2009-01-01', 'Rosé', 17.00, 1.70000005, 'Wild Vines.png', 'Wild Vines');
INSERT INTO tb_wine VALUES (3, '2013-01-01', 'Red Wine', 12.00, 1.20000005, 'Alcott Ridge.png', 'Alcott Ridge');
INSERT INTO tb_wine VALUES (2, '2013-01-01', 'White Wine', 11.00, 1.10000002, 'Accents.png', 'Accents');
INSERT INTO tb_wine VALUES (4, '2011-01-01', 'Red Wine', 10.00, 1, 'Anapamu.png', 'Anapamu');
INSERT INTO tb_wine VALUES (35, '2009-01-01', 'White Champagne', 18.00, 1.79999995, 'Totts.png', 'Totts');


--
-- TOC entry 2077 (class 0 OID 0)
-- Dependencies: 185
-- Name: tb_wine_fl_id_seq; Type: SEQUENCE SET; Schema: winepro; Owner: postgres
--

SELECT pg_catalog.setval('tb_wine_fl_id_seq', 38, true);


--
-- TOC entry 2053 (class 0 OID 24711)
-- Dependencies: 186
-- Data for Name: tb_wine_order; Type: TABLE DATA; Schema: winepro; Owner: postgres
--



--
-- TOC entry 2078 (class 0 OID 0)
-- Dependencies: 187
-- Name: tb_wine_order_fl_id_seq; Type: SEQUENCE SET; Schema: winepro; Owner: postgres
--

SELECT pg_catalog.setval('tb_wine_order_fl_id_seq', 1, false);


--
-- TOC entry 1916 (class 2606 OID 24726)
-- Name: pk_tb_user_fl_name; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_user
    ADD CONSTRAINT pk_tb_user_fl_name PRIMARY KEY (name);


--
-- TOC entry 1908 (class 2606 OID 24877)
-- Name: pkey_order_id; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_order
    ADD CONSTRAINT pkey_order_id PRIMARY KEY (fl_id);


--
-- TOC entry 1903 (class 2606 OID 24730)
-- Name: pkey_tb_address_fl_id; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_address
    ADD CONSTRAINT pkey_tb_address_fl_id PRIMARY KEY (fl_id);


--
-- TOC entry 1905 (class 2606 OID 24734)
-- Name: pkey_tb_inventory_fl_id; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_inventory
    ADD CONSTRAINT pkey_tb_inventory_fl_id PRIMARY KEY (fl_id);


--
-- TOC entry 1910 (class 2606 OID 24736)
-- Name: pkey_tb_payment_info_fl_id; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_payment_info
    ADD CONSTRAINT pkey_tb_payment_info_fl_id PRIMARY KEY (fl_id);


--
-- TOC entry 1912 (class 2606 OID 24738)
-- Name: pkey_tb_transportation_company_fl_id; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_transportation_company
    ADD CONSTRAINT pkey_tb_transportation_company_fl_id PRIMARY KEY (fl_id);


--
-- TOC entry 1918 (class 2606 OID 24740)
-- Name: pkey_tb_warehouse_fl_id; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_warehouse
    ADD CONSTRAINT pkey_tb_warehouse_fl_id PRIMARY KEY (fl_id);


--
-- TOC entry 1924 (class 2606 OID 24742)
-- Name: pkey_tb_wine_order_fl_id; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_wine_order
    ADD CONSTRAINT pkey_tb_wine_order_fl_id PRIMARY KEY (fl_id);


--
-- TOC entry 1922 (class 2606 OID 24744)
-- Name: pkey_wine_id; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_wine
    ADD CONSTRAINT pkey_wine_id PRIMARY KEY (fl_id);


--
-- TOC entry 1914 (class 2606 OID 24795)
-- Name: unq_tb_transportation_company_fl_name; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_transportation_company
    ADD CONSTRAINT unq_tb_transportation_company_fl_name UNIQUE (fl_name);


--
-- TOC entry 1920 (class 2606 OID 24788)
-- Name: unq_tb_warehouse_fl_name; Type: CONSTRAINT; Schema: winepro; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_warehouse
    ADD CONSTRAINT unq_tb_warehouse_fl_name UNIQUE (fl_name);


--
-- TOC entry 1906 (class 1259 OID 24978)
-- Name: unq_idx_fl_wine_id_fl_warehouse_id; Type: INDEX; Schema: winepro; Owner: postgres; Tablespace: 
--

CREATE UNIQUE INDEX unq_idx_fl_wine_id_fl_warehouse_id ON tb_inventory USING btree (fl_wine_id, fl_warehouse_id);


--
-- TOC entry 1928 (class 2606 OID 24782)
-- Name: fkey_tb_address_fl_address_id; Type: FK CONSTRAINT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_warehouse
    ADD CONSTRAINT fkey_tb_address_fl_address_id FOREIGN KEY (fl_address_id) REFERENCES tb_address(fl_id);


--
-- TOC entry 1925 (class 2606 OID 24746)
-- Name: fkey_tb_inventory_fl_wine_id_fl_id; Type: FK CONSTRAINT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_inventory
    ADD CONSTRAINT fkey_tb_inventory_fl_wine_id_fl_id FOREIGN KEY (fl_wine_id) REFERENCES tb_wine(fl_id);


--
-- TOC entry 1927 (class 2606 OID 24892)
-- Name: fkey_tb_user_name; Type: FK CONSTRAINT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_order
    ADD CONSTRAINT fkey_tb_user_name FOREIGN KEY (fl_customer_name) REFERENCES tb_user(name);


--
-- TOC entry 1926 (class 2606 OID 24887)
-- Name: fkey_tb_warehouse_id; Type: FK CONSTRAINT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_inventory
    ADD CONSTRAINT fkey_tb_warehouse_id FOREIGN KEY (fl_warehouse_id) REFERENCES tb_warehouse(fl_id);


--
-- TOC entry 1930 (class 2606 OID 24878)
-- Name: fkey_tb_wine_order_fl_order_id; Type: FK CONSTRAINT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_wine_order
    ADD CONSTRAINT fkey_tb_wine_order_fl_order_id FOREIGN KEY (fl_order_id) REFERENCES tb_order(fl_id);


--
-- TOC entry 1929 (class 2606 OID 24756)
-- Name: fkey_tb_wine_order_fl_wine_id; Type: FK CONSTRAINT; Schema: winepro; Owner: postgres
--

ALTER TABLE ONLY tb_wine_order
    ADD CONSTRAINT fkey_tb_wine_order_fl_wine_id FOREIGN KEY (fl_wine_id) REFERENCES tb_wine(fl_id);


--
-- TOC entry 2061 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2014-06-19 00:16:33

--
-- PostgreSQL database dump complete
--

