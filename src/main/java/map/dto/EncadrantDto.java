package map.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EncadrantDto implements Comparable<EncadrantDto>{

    private Long id ;
    private String name;
    private String profil;
    private String email;
    private Long experience;

    private String password;

    @Override
    public int compareTo(EncadrantDto encadrantDto) {
        if (!this.name.equals(encadrantDto.getName()))
            return this.name.compareTo(encadrantDto.getName());
        else
            return this.profil.compareTo(encadrantDto.getProfil());
    }
}
