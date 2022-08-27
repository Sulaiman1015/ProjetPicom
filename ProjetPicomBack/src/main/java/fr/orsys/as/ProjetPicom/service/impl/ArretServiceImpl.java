package fr.orsys.as.ProjetPicom.service.impl;
import fr.orsys.as.ProjetPicom.dao.ArretDao;
import fr.orsys.as.ProjetPicom.service.ArretService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ArretServiceImpl implements ArretService {
    private ArretDao arretDao;
}
