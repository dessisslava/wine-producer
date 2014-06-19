--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.4
-- Dumped by pg_dump version 9.3.4
-- Started on 2014-06-20 00:56:35

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

DROP DATABASE "retailer_db_v1.0";
--
-- TOC entry 1938 (class 1262 OID 24962)
-- Name: retailer_db_v1.0; Type: DATABASE; Schema: -; Owner: -
--

CREATE DATABASE "retailer_db_v1.0" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Turkish_Turkey.1254' LC_CTYPE = 'Turkish_Turkey.1254';


\connect "retailer_db_v1.0"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 5 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA public;


--
-- TOC entry 1939 (class 0 OID 0)
-- Dependencies: 5
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON SCHEMA public IS 'standard public schema';


--
-- TOC entry 7 (class 2615 OID 24963)
-- Name: retailer; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA retailer;


--
-- TOC entry 172 (class 3079 OID 11750)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1940 (class 0 OID 0)
-- Dependencies: 172
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = retailer, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = true;

--
-- TOC entry 171 (class 1259 OID 24964)
-- Name: tb_user; Type: TABLE; Schema: retailer; Owner: -; Tablespace: 
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


--
-- TOC entry 1933 (class 0 OID 24964)
-- Dependencies: 171
-- Data for Name: tb_user; Type: TABLE DATA; Schema: retailer; Owner: -
--

INSERT INTO tb_user VALUES ('retailer', 'retailer', true, 'admin@alaz.biz', 'Retailer', 'The', 'Drunk', 'ADMIN');


--
-- TOC entry 1825 (class 2606 OID 24970)
-- Name: pk_tb_user_fl_name; Type: CONSTRAINT; Schema: retailer; Owner: -; Tablespace: 
--

ALTER TABLE ONLY tb_user
    ADD CONSTRAINT pk_tb_user_fl_name PRIMARY KEY (name);


-- Completed on 2014-06-20 00:56:35

--
-- PostgreSQL database dump complete
--

