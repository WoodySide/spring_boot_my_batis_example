CREATE TABLE COMPANY (
    company_id IDENTITY PRIMARY KEY NOT NULL,
    name VARCHAR(100) NOT NULL ,
    creation_date DATE
);

CREATE TABLE BRANCH (
    branch_id INT PRIMARY KEY NOT NULL,
    branch_full_name VARCHAR(50) NOT NULL,
    branch_address VARCHAR(100) NOT NULL,
    company_id INT NOT NULL,
    FOREIGN KEY (company_id)
    REFERENCES COMPANY (company_id)
);
