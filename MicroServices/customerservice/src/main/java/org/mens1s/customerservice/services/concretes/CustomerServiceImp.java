package org.mens1s.customerservice.services.concretes;

import lombok.RequiredArgsConstructor;
import org.mens1s.customerservice.clients.OrderServiceClient;
import org.mens1s.customerservice.repositories.CustomerRepository;
import org.mens1s.customerservice.services.abstracts.CustomerService;
import org.mens1s.customerservice.services.dtos.requests.SearchCustomerRequest;
import org.mens1s.customerservice.services.dtos.responses.SearchCustomerResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImp implements CustomerService {
    private final CustomerRepository customerRepository;
    private final WebClient.Builder webClient;
    private final OrderServiceClient orderServiceClient;
    @Override
    public List<SearchCustomerResponse> search(SearchCustomerRequest request){
        /*
        var result = webClient.build()
                .get()
                .uri("http://localhost:8081/api/orders?orderId="+request.getOrderNumber())
                .retrieve()
                .bodyToMono(Integer.class)
                .block();

         */
        int result = orderServiceClient.getCustomerIdByOrderId(request.getOrderNumber());
        System.out.printf("Order service result: " + result);

        return customerRepository.search(request);
    }
}
