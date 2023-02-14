CREATE TABLE develop.employee
(
    id         BIGINT NOT NULL,
    name       VARCHAR(255),
    age        INTEGER,
    department VARCHAR(255),
    CONSTRAINT id_pk PRIMARY KEY (id)
);