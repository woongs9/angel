package com.toilet.urgent.service;

import com.toilet.urgent.dto.MypositionDto;
import com.toilet.urgent.entity.Toilet;

import java.util.List;

public interface ToiletService {
    List<Toilet> listToilet(Toilet toilet, MypositionDto dto);

}
