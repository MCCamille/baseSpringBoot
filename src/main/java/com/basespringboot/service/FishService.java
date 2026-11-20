@Service
public class FishService {

    private final FishRepository fishRepository;

    public FishService(FishRepository fishRepository) {
        this.fishRepository = fishRepository;
    }

    @Transactional
    public FishDTO createFish(FishDTO fishDTO) {
        Fish fish = new Fish();
        fish.setName(fishDTO.getName());
        // initialiser ici les valeurs par défaut si besoin
        return convertToDTO(fishRepository.save(fish));
    }

    @Transactional(readOnly = true)
    public FishDTO getFish(Long id) {
        Fish fish = fishRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Fish not found: " + id));
        return convertToDTO(fish);
    }

    @Transactional(readOnly = true)
    public List<FishDTO> getAllFish() {
        return fishRepository.findAll().stream().map(this::convertToDTO).toList();
    }

    private FishDTO convertToDTO(Fish fish) { /* inchangé */ }
}