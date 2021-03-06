package com.jlfex.hermes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jlfex.hermes.model.Invest;
import com.jlfex.hermes.model.Loan;
import com.jlfex.hermes.model.User;

/**
 * 
 * 理财信息仓库
 * 
 * @author chenqi
 * @version 1.0, 2013-12-24
 * @since 1.0
 */
@Repository
public interface InvestRepository extends JpaRepository<Invest, String> {

	/**
	 * 通过用户信息查找对应理财信息
	 * 
	 * @param user
	 * @return
	 */
	@Query("from Invest  where user = ?1 order by status asc")
	public List<Invest> findByUser(User user);

	/**
	 * 通过借款信息查找对应理财信息
	 * 
	 * @param loan
	 * @return
	 */
	@Query("from Invest  where loan = ?1 order by datetime desc")
	public List<Invest> findByLoan(Loan loan);

	/**
	 * 通过用户id和状态统计记录数
	 * 
	 * @param userId
	 * @param status
	 * @return
	 */
	@Query("select count(id) from Invest where user =  ?1 and status in ?2")
	public Long loadCountByUserAndStatus(User user, List<String> statusList);

	/**
	 * 通过用户id加载理财信息
	 * 
	 * @param userId
	 * @return
	 */
	public List<Invest> findByUserIdOrderByStatusAscDatetimeDesc(String userId);

}
