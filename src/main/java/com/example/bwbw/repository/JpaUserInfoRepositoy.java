package com.example.bwbw.repository;

import com.example.bwbw.entity.UserInfoEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.jdbc.core.RowMapper;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class JpaUserInfoRepositoy implements UserInfoRepository{

    private final EntityManager em;

    public JpaUserInfoRepositoy(EntityManager em) {
        this.em = em;
    }


    @Override
    public UserInfoEntity save(UserInfoEntity userInfoEntity)
    {
       /* SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName("user_info").usingGeneratedKeyColumns("user_id");
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("created_at", userInfoEntity.getCreatedAt());
        parameters.put("email", userInfoEntity.getEmail());
        parameters.put("gender", userInfoEntity.getGender());
        parameters.put("major", userInfoEntity.getMajor());
        parameters.put("modified_at", userInfoEntity.getModifiedAt());
        parameters.put("modified_major_at", userInfoEntity.getModifiedMajorAt());
        parameters.put("nickname", userInfoEntity.getNickname());
        parameters.put("password", userInfoEntity.getPassword());
        parameters.put("refresh_token", userInfoEntity.getRefreshToken());*/

        em.persist(userInfoEntity);
        return userInfoEntity;

    }

    @Override
    public Optional<UserInfoEntity> findByEmail (String email)
    {
        UserInfoEntity userInfoEntity = em.find(UserInfoEntity.class, email);
        return Optional.ofNullable(userInfoEntity);
    }

    @Override
    public Optional<UserInfoEntity> findByNickname(String nickname)
    {
        UserInfoEntity userInfoEntity = em.find(UserInfoEntity.class, nickname);
        return Optional.ofNullable(userInfoEntity);
    }

    @Override
    public List<UserInfoEntity> findAll() {
        return null;
    }

    @Override
    public List<UserInfoEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UserInfoEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<UserInfoEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(UserInfoEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserInfoEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends UserInfoEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserInfoEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends UserInfoEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserInfoEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<UserInfoEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserInfoEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public UserInfoEntity getById(Long aLong) {
        return null;
    }

    @Override
    public UserInfoEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UserInfoEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserInfoEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserInfoEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserInfoEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserInfoEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserInfoEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UserInfoEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    private RowMapper<UserInfoEntity> memberRowMapper() {
        return (rs, rowNum) -> {
            UserInfoEntity userInfo = new UserInfoEntity();
            userInfo.setEmail(rs.getString("email"));
            userInfo.setNickname(rs.getString("nickname"));
            return userInfo;
        };
    }
}
