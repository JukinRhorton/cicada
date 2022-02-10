package org.aquarius.cicada.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VisitHistoryExample {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	protected String orderByClause;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	protected boolean distinct;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public VisitHistoryExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the
	 * database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andSiteNameIsNull() {
			addCriterion("SITE_NAME is null");
			return (Criteria) this;
		}

		public Criteria andSiteNameIsNotNull() {
			addCriterion("SITE_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andSiteNameEqualTo(String value) {
			addCriterion("SITE_NAME =", value, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameNotEqualTo(String value) {
			addCriterion("SITE_NAME <>", value, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameGreaterThan(String value) {
			addCriterion("SITE_NAME >", value, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
			addCriterion("SITE_NAME >=", value, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameLessThan(String value) {
			addCriterion("SITE_NAME <", value, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameLessThanOrEqualTo(String value) {
			addCriterion("SITE_NAME <=", value, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameLike(String value) {
			addCriterion("SITE_NAME like", value, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameNotLike(String value) {
			addCriterion("SITE_NAME not like", value, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameIn(List<String> values) {
			addCriterion("SITE_NAME in", values, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameNotIn(List<String> values) {
			addCriterion("SITE_NAME not in", values, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameBetween(String value1, String value2) {
			addCriterion("SITE_NAME between", value1, value2, "siteName");
			return (Criteria) this;
		}

		public Criteria andSiteNameNotBetween(String value1, String value2) {
			addCriterion("SITE_NAME not between", value1, value2, "siteName");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberIsNull() {
			addCriterion("LAST_VISIT_PAGE_NUMBER is null");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberIsNotNull() {
			addCriterion("LAST_VISIT_PAGE_NUMBER is not null");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberEqualTo(Integer value) {
			addCriterion("LAST_VISIT_PAGE_NUMBER =", value, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberNotEqualTo(Integer value) {
			addCriterion("LAST_VISIT_PAGE_NUMBER <>", value, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberGreaterThan(Integer value) {
			addCriterion("LAST_VISIT_PAGE_NUMBER >", value, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberGreaterThanOrEqualTo(Integer value) {
			addCriterion("LAST_VISIT_PAGE_NUMBER >=", value, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberLessThan(Integer value) {
			addCriterion("LAST_VISIT_PAGE_NUMBER <", value, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberLessThanOrEqualTo(Integer value) {
			addCriterion("LAST_VISIT_PAGE_NUMBER <=", value, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberIn(List<Integer> values) {
			addCriterion("LAST_VISIT_PAGE_NUMBER in", values, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberNotIn(List<Integer> values) {
			addCriterion("LAST_VISIT_PAGE_NUMBER not in", values, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberBetween(Integer value1, Integer value2) {
			addCriterion("LAST_VISIT_PAGE_NUMBER between", value1, value2, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastVisitPageNumberNotBetween(Integer value1, Integer value2) {
			addCriterion("LAST_VISIT_PAGE_NUMBER not between", value1, value2, "lastVisitPageNumber");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountIsNull() {
			addCriterion("LAST_TOTAL_PAGE_COUNT is null");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountIsNotNull() {
			addCriterion("LAST_TOTAL_PAGE_COUNT is not null");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountEqualTo(Integer value) {
			addCriterion("LAST_TOTAL_PAGE_COUNT =", value, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountNotEqualTo(Integer value) {
			addCriterion("LAST_TOTAL_PAGE_COUNT <>", value, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountGreaterThan(Integer value) {
			addCriterion("LAST_TOTAL_PAGE_COUNT >", value, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("LAST_TOTAL_PAGE_COUNT >=", value, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountLessThan(Integer value) {
			addCriterion("LAST_TOTAL_PAGE_COUNT <", value, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountLessThanOrEqualTo(Integer value) {
			addCriterion("LAST_TOTAL_PAGE_COUNT <=", value, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountIn(List<Integer> values) {
			addCriterion("LAST_TOTAL_PAGE_COUNT in", values, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountNotIn(List<Integer> values) {
			addCriterion("LAST_TOTAL_PAGE_COUNT not in", values, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountBetween(Integer value1, Integer value2) {
			addCriterion("LAST_TOTAL_PAGE_COUNT between", value1, value2, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastTotalPageCountNotBetween(Integer value1, Integer value2) {
			addCriterion("LAST_TOTAL_PAGE_COUNT not between", value1, value2, "lastTotalPageCount");
			return (Criteria) this;
		}

		public Criteria andLastUpdateIsNull() {
			addCriterion("LAST_UPDATE is null");
			return (Criteria) this;
		}

		public Criteria andLastUpdateIsNotNull() {
			addCriterion("LAST_UPDATE is not null");
			return (Criteria) this;
		}

		public Criteria andLastUpdateEqualTo(Date value) {
			addCriterionForJDBCDate("LAST_UPDATE =", value, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastUpdateNotEqualTo(Date value) {
			addCriterionForJDBCDate("LAST_UPDATE <>", value, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastUpdateGreaterThan(Date value) {
			addCriterionForJDBCDate("LAST_UPDATE >", value, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("LAST_UPDATE >=", value, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastUpdateLessThan(Date value) {
			addCriterionForJDBCDate("LAST_UPDATE <", value, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("LAST_UPDATE <=", value, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastUpdateIn(List<Date> values) {
			addCriterionForJDBCDate("LAST_UPDATE in", values, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastUpdateNotIn(List<Date> values) {
			addCriterionForJDBCDate("LAST_UPDATE not in", values, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastUpdateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("LAST_UPDATE between", value1, value2, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("LAST_UPDATE not between", value1, value2, "lastUpdate");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsIsNull() {
			addCriterion("LAST_PAGE_URLS is null");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsIsNotNull() {
			addCriterion("LAST_PAGE_URLS is not null");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsEqualTo(String value) {
			addCriterion("LAST_PAGE_URLS =", value, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsNotEqualTo(String value) {
			addCriterion("LAST_PAGE_URLS <>", value, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsGreaterThan(String value) {
			addCriterion("LAST_PAGE_URLS >", value, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsGreaterThanOrEqualTo(String value) {
			addCriterion("LAST_PAGE_URLS >=", value, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsLessThan(String value) {
			addCriterion("LAST_PAGE_URLS <", value, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsLessThanOrEqualTo(String value) {
			addCriterion("LAST_PAGE_URLS <=", value, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsLike(String value) {
			addCriterion("LAST_PAGE_URLS like", value, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsNotLike(String value) {
			addCriterion("LAST_PAGE_URLS not like", value, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsIn(List<String> values) {
			addCriterion("LAST_PAGE_URLS in", values, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsNotIn(List<String> values) {
			addCriterion("LAST_PAGE_URLS not in", values, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsBetween(String value1, String value2) {
			addCriterion("LAST_PAGE_URLS between", value1, value2, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andLastPageUrlsNotBetween(String value1, String value2) {
			addCriterion("LAST_PAGE_URLS not between", value1, value2, "lastPageUrls");
			return (Criteria) this;
		}

		public Criteria andChannelIsNull() {
			addCriterion("CHANNEL is null");
			return (Criteria) this;
		}

		public Criteria andChannelIsNotNull() {
			addCriterion("CHANNEL is not null");
			return (Criteria) this;
		}

		public Criteria andChannelEqualTo(String value) {
			addCriterion("CHANNEL =", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelNotEqualTo(String value) {
			addCriterion("CHANNEL <>", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelGreaterThan(String value) {
			addCriterion("CHANNEL >", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelGreaterThanOrEqualTo(String value) {
			addCriterion("CHANNEL >=", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelLessThan(String value) {
			addCriterion("CHANNEL <", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelLessThanOrEqualTo(String value) {
			addCriterion("CHANNEL <=", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelLike(String value) {
			addCriterion("CHANNEL like", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelNotLike(String value) {
			addCriterion("CHANNEL not like", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelIn(List<String> values) {
			addCriterion("CHANNEL in", values, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelNotIn(List<String> values) {
			addCriterion("CHANNEL not in", values, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelBetween(String value1, String value2) {
			addCriterion("CHANNEL between", value1, value2, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelNotBetween(String value1, String value2) {
			addCriterion("CHANNEL not between", value1, value2, "channel");
			return (Criteria) this;
		}

		public Criteria andFinishedIsNull() {
			addCriterion("FINISHED is null");
			return (Criteria) this;
		}

		public Criteria andFinishedIsNotNull() {
			addCriterion("FINISHED is not null");
			return (Criteria) this;
		}

		public Criteria andFinishedEqualTo(Boolean value) {
			addCriterion("FINISHED =", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedNotEqualTo(Boolean value) {
			addCriterion("FINISHED <>", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedGreaterThan(Boolean value) {
			addCriterion("FINISHED >", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("FINISHED >=", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedLessThan(Boolean value) {
			addCriterion("FINISHED <", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedLessThanOrEqualTo(Boolean value) {
			addCriterion("FINISHED <=", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedIn(List<Boolean> values) {
			addCriterion("FINISHED in", values, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedNotIn(List<Boolean> values) {
			addCriterion("FINISHED not in", values, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedBetween(Boolean value1, Boolean value2) {
			addCriterion("FINISHED between", value1, value2, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("FINISHED not between", value1, value2, "finished");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the
	 * database table VISIT_HISTORY
	 *
	 * @mbg.generated do_not_delete_during_merge Sat Sep 25 10:34:13 JST 2021
	 */
	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the
	 * database table VISIT_HISTORY
	 *
	 * @mbg.generated Sat Sep 25 10:34:13 JST 2021
	 */
	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}