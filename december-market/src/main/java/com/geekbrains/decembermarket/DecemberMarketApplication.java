package com.geekbrains.decembermarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecemberMarketApplication {
	// Домашнее задание:
	// 1. История заказов
	// 2. Добавить регистрацию с валидацией
	// 3. Покупка в 1 клик без регистрации по номеру телефона
	// 4. Автоподвязывание по номеру телефона истории заказов (если человек на номер 123
	// в виде гостя оформил 20 заказов, и потом зарегался под этим номером, то под его
	// новую учетную запись должны подвязаться все эти заказы)
	// 5. Если пользователь купил товар, то он должен иметь возможность оставить отзыв
	// о товаре, и выставить оценку

	// План на курс:
	// 1. Добавить платежную систему (PayPal)
	// 2. Авторизация через соцсети
	// 3. Комментарии к товарам, отзыв/рейтинг
	// 4. Отправка уведомлений пользователю, на сайте, или на почту
	// 5. Промокоды
	// 6. Логирование
	// 7. Профиль/редактирование профиля
	// 8. Отдельная админка
	// 9. Картинки для товаров
	// 10. HTTPS
	// 11. История просмотров товара (куки)
	// 12. Статистика для владельца
	// 13. История действий на сайте
	// 14. Смс сервис
	// 15. Восстановление пароля
	// 16. Формирование PDF для заказа

	public static void main(String[] args) {
		SpringApplication.run(DecemberMarketApplication.class, args);
	}
}