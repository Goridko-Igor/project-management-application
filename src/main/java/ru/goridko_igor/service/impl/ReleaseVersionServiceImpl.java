package ru.goridko_igor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.goridko_igor.repository.ReleaseVersionRepository;
import ru.goridko_igor.service.ReleaseVersionService;

@Service
public class ReleaseVersionServiceImpl implements ReleaseVersionService {
    private final ReleaseVersionRepository releaseVersionRepository;

    @Autowired
    public ReleaseVersionServiceImpl(ReleaseVersionRepository releaseVersionRepository) {
        this.releaseVersionRepository = releaseVersionRepository;
    }
}
