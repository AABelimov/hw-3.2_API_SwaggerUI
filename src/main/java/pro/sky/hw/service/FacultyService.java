package pro.sky.hw.service;

import pro.sky.hw.model.Faculty;

import java.util.HashMap;
import java.util.Map;

public class FacultyService {

    private Map<Long, Faculty> faculties = new HashMap<>();
    private Long nextId = 0L;
}
