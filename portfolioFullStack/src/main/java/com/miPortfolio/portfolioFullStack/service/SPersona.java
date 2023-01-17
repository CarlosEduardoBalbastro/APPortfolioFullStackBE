
package com.miPortfolio.portfolioFullStack.service;

import com.miPortfolio.portfolioFullStack.repository.RPersona;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SPersona {
    
    @Autowired
    private RPersona personRepository;
    
}
