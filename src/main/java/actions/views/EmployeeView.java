package actions.views;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//従業員情報について画面の入力値・出力値を扱うViewモデル

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeView {

    private Integer id;

    private String code;

    private String  name;

    private String password;

//    管理者権限があるかどうか(一般：0、管理者：1）

    private Integer adminFlag;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

//    削除された従業員かどうか（現役：0、削除済み：1）

    private Integer deleteFlag;
}
