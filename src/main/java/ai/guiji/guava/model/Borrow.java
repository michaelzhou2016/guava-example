package ai.guiji.guava.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 借款信息表实体
 */
public class Borrow implements Serializable {

    private static final long serialVersionUID = 263362265069304573L;

    /**
     * 主键Id
     */
    private Long id;

    /**
     * 用户 id
     */
    private Long userId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 借款金额
     */
    private Double amount;

    /**
     * 实际到账金额
     */
    private Double realAmount;

    /**
     * 综合费用(借款利息+服务费+信息认证费)
     */
    private Double fee;

    /**
     * 订单生成时间
     */
    private LocalDateTime createTime;

    /**
     * 借款期限(天)
     */
    private String timeLimit;

    /**
     * 订单状态 10 申请成功待审核 20自动审核通过 21自动审核不通过 22自动审核未决待人工复审 26人工复审通过 27人工复审不通过
     * 30放款成功 40还款成功 50逾期 90坏账
     */
    private String state;

    /**
     * 收款银行卡关联id
     */
    private Long cardId;

    /**
     * 服务费
     */
    private Double serviceFee;

    /**
     * 信息认证费
     */
    private Double infoAuthFee;

    /**
     * 借款利息
     */
    private Double interest;

    /**
     * 客户端 默认10-移动app
     */
    private String client;

    /**
     * 借款地址
     */
    private String address;

    /**
     * 借款坐标
     */
    private String coordinate;

    /**
     * 备注、审核说明
     */
    private String remark;

    /**
     * 借款ip
     */
    private String ip;

    /**
     * 是否是复借
     */
    private Integer isMulti;

    private Integer reason;

    /**
     * 保费状态
     */
    private Integer insuranceState;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 待放款操作时间
     */
    private Date wlUpdateTime;

    public Borrow() {
        super();
    }

    public Borrow(Double amount) {
        this.amount = amount;
    }

    public Borrow(Long userId, Double amount, String timeLimit, Long cardId, String client, String address,
                  String coordinate, String ip) {
        super();
        this.userId = userId;
        this.amount = amount;
        this.timeLimit = timeLimit;
        this.cardId = cardId;
        this.client = client;
        this.address = address;
        this.coordinate = coordinate;
        this.ip = ip;
    }

    /**
     * 获取主键Id
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键Id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 要设置的用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取订单号
     *
     * @return 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 要设置的订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取借款金额
     *
     * @return 借款金额
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * 设置借款金额
     *
     * @param amount 要设置的借款金额
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 获取实际到账金额
     *
     * @return 实际到账金额
     */
    public Double getRealAmount() {
        return realAmount;
    }

    /**
     * 设置实际到账金额
     *
     * @param realAmount 要设置的实际到账金额
     */
    public void setRealAmount(Double realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取综合费用(借款利息+服务费+信息认证费)
     *
     * @return 综合费用(借款利息 + 服务费 + 信息认证费)
     */
    public Double getFee() {
        return fee;
    }

    /**
     * 设置综合费用(借款利息+服务费+信息认证费)
     *
     * @param fee 要设置的综合费用(借款利息+服务费+信息认证费)
     */
    public void setFee(Double fee) {
        this.fee = fee;
    }

    /**
     * 获取订单生成时间
     *
     * @return 订单生成时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单生成时间
     *
     * @param createTime 要设置的订单生成时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取借款期限(天)
     *
     * @return 借款期限(天)
     */
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * 设置借款期限(天)
     *
     * @param timeLimit 要设置的借款期限(天)
     */
    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * 获取订单状态 10-审核中 20-待还款 30-已还款
     *
     * @return 订单状态 10-审核中 20-待还款 30-已还款
     */
    public String getState() {
        return state;
    }

    /**
     * 设置订单状态 10-审核中 20-待还款 30-已还款
     *
     * @param state 要设置的订单状态 10-审核中 20-待还款 30-已还款
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取收款银行卡关联id
     *
     * @return 收款银行卡关联id
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * 设置收款银行卡关联id
     *
     * @param cardId 要设置的收款银行卡关联id
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取服务费
     *
     * @return 服务费
     */
    public Double getServiceFee() {
        return serviceFee;
    }

    /**
     * 设置服务费
     *
     * @param serviceFee 要设置的服务费
     */
    public void setServiceFee(Double serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * 获取信息认证费
     *
     * @return 信息认证费
     */
    public Double getInfoAuthFee() {
        return infoAuthFee;
    }

    /**
     * 设置信息认证费
     *
     * @param infoAuthFee 要设置的信息认证费
     */
    public void setInfoAuthFee(Double infoAuthFee) {
        this.infoAuthFee = infoAuthFee;
    }

    /**
     * 获取借款利息
     *
     * @return 借款利息
     */
    public Double getInterest() {
        return interest;
    }

    /**
     * 设置借款利息
     *
     * @param interest 要设置的借款利息
     */
    public void setInterest(Double interest) {
        this.interest = interest;
    }

    /**
     * 获取客户端 默认10-移动app
     *
     * @return 客户端 默认10-移动app
     */
    public String getClient() {
        return client;
    }

    /**
     * 设置客户端 默认10-移动app
     *
     * @param client 要设置的客户端 默认10-移动app
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the coordinate
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * @param coordinate the coordinate to set
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getIsMulti() {
        return isMulti;
    }

    public void setIsMulti(Integer isMulti) {
        this.isMulti = isMulti;
    }

    public Integer getInsuranceState() {
        return insuranceState;
    }

    public void setInsuranceState(Integer insuranceState) {
        this.insuranceState = insuranceState;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getWlUpdateTime() {
        return wlUpdateTime;
    }

    public void setWlUpdateTime(Date wlUpdateTime) {
        this.wlUpdateTime = wlUpdateTime;
    }

	@Override
	public String toString() {
		return "Borrow{" +
				"id=" + id +
				", userId=" + userId +
				", orderNo='" + orderNo + '\'' +
				", amount=" + amount +
				", realAmount=" + realAmount +
				", fee=" + fee +
				", createTime=" + createTime +
				", timeLimit='" + timeLimit + '\'' +
				", state='" + state + '\'' +
				", cardId=" + cardId +
				", serviceFee=" + serviceFee +
				", infoAuthFee=" + infoAuthFee +
				", interest=" + interest +
				", client='" + client + '\'' +
				", address='" + address + '\'' +
				", coordinate='" + coordinate + '\'' +
				", remark='" + remark + '\'' +
				", ip='" + ip + '\'' +
				", isMulti=" + isMulti +
				", reason=" + reason +
				", insuranceState=" + insuranceState +
				", auditTime=" + auditTime +
				", wlUpdateTime=" + wlUpdateTime +
				'}';
	}
}