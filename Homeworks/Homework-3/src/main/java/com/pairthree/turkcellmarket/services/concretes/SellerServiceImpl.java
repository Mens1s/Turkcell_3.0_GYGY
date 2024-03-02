package com.pairthree.turkcellmarket.services.concretes;

import com.pairthree.turkcellmarket.entities.user.Seller;
import com.pairthree.turkcellmarket.repositories.concretes.SellerRepository;
import com.pairthree.turkcellmarket.services.abstracts.SellerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SellerServiceImpl implements SellerService {
    private SellerRepository sellerRepository;

    public SellerServiceImpl(SellerRepository sellerRepository){
        this.sellerRepository = sellerRepository;
    }

    @Override
    public void add(Seller seller) {
        sellerRepository.add(seller);
    }

    @Override
    public void update(Seller seller) {
        sellerRepository.update(seller);
    }

    @Override
    public void delete(String id) {
        sellerRepository.delete(id);
    }

    @Override
    public Seller get(String id) {
        return sellerRepository.get(id);
    }

    @Override
    public List<Seller> getAll() {
        return sellerRepository.getAll();
    }
}
