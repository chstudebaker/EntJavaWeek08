package com.cstudebaker.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HBAPIDaoTest {

    @Test
    void getPlanetSuccess() {
        HBAPIDao dao = new HBAPIDao();
        assertEquals("Tatooine", dao.getPlanet().getName());

    }
}