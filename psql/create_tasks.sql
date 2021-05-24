CREATE TABLE public.task
(
    id integer NOT NULL DEFAULT nextval('task_id_seq'::regclass),
    "user" integer NOT NULL,
    name character varying COLLATE pg_catalog."default",
    date timestamp without time zone,
    CONSTRAINT task_pkey PRIMARY KEY (id)
);

GRANT ALL ON TABLE public.task TO postgres WITH GRANT OPTION;

INSERT INTO public.task("user", name, date)
VALUES (1, 'Согласовать документы пакет документов от Плановой К.T. до 05.06', '2017-05-06');
VALUES (1, 'Cогласовать документы финансового отдела', '2018-06-07');
INSERT INTO public.task("user", name, date)
VALUES (2, 'Утвердить решение ГРБС', '2018-07-06');
INSERT INTO public.task("user", name, date)
VALUES (3, 'Отправить зам. Министра на итоговое согласование', '2018-07-12');
INSERT INTO public.task("user", name, date)
VALUES (2, 'Поставить подпись от имени Парамонова Е. А. (ушел в отпуск)', '2018-08-06');
INSERT INTO public.task("user", name, date)
VALUES (3, 'Отправить от лица заявителя Кириллова Л. Г.', '2018-09-22');
INSERT INTO public.task("user", name, date)
VALUES (5, 'Согласовать постановление МЭР по проекту “Фотон”', '2018-10-09');
INSERT INTO public.task("user", name, date)
VALUES (4, 'Подписать решение МинФин от 10.09', '2018-10-15');
INSERT INTO public.task("user", name, date)
VALUES (4, 'Отправить решение от 10.15 на доработку ', '2019-01-16');


