package com.toilet.urgent.service;


import com.toilet.urgent.entity.Toilet;
import com.toilet.urgent.repository.ToiletRepository;

import java.util.List;

public class ToiletServiceImpl implements ToiletService{
    private final ToiletRepository toiletRepository;

    public ToiletServiceImpl(ToiletRepository toiletRepository) {
        this.toiletRepository = toiletRepository;
    }

    @Override
    public List<Toilet> listToilet(Toilet toilet) {
        List<Toilet> toiletList = toiletRepository.findById(toilet.getToiletNum());
        return toiletList;
    }
}
