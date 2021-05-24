-- Table: public.users

-- DROP TABLE public.users;

CREATE TABLE public.users
(
    id integer NOT NULL DEFAULT nextval('users_id_seq'::regclass),
    name character varying COLLATE pg_catalog."default",
    CONSTRAINT users_pkey PRIMARY KEY (id)
);

GRANT ALL ON TABLE public.users TO postgres WITH GRANT OPTION;

INSERT INTO public.users (name) VALUES ('Иван');
INSERT INTO public.users (name) VALUES ('Мария');
INSERT INTO public.users (name) VALUES ('Тихомир');
INSERT INTO public.users (name) VALUES ('Петр');
INSERT INTO public.users (name) VALUES ('Иван');
